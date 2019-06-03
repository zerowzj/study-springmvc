package study.spring.web;

import com.google.common.base.Joiner;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import study.spring.support.action.Action;
import study.spring.support.context.SpringContext;
import study.spring.support.web.Api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Api路由
 *
 * @author wangzhj
 */
@Api
public class ApiRouter {

    private static final String ACTION_PREFIX = "action";

    /**
     * 路由
     *
     * @param action   动作
     * @param request  Http请求
     * @param response Http响应
     * @return Map
     */
    @RequestMapping(value = "/{action}")
    public Map<String, Object> routeByModule(@PathVariable String action,
                                             HttpServletRequest request, HttpServletResponse response) {
        return doProcess(request, response, action);
    }

    /**
     * 路由
     *
     * @param module   模块
     * @param action   动作
     * @param request  Http请求
     * @param response Http响应
     * @return Map
     */
//    @RequestMapping(value = {"/api/{module}/{action}"})
//    public Map<String, Object> routeByModule(@PathVariable String module, @PathVariable String action,
//                                             HttpServletRequest request, HttpServletResponse response) {
//        return doProcess(request, response, module, action);
//    }
    private Map<String, Object> doProcess(HttpServletRequest request, HttpServletResponse response, String array) {
        String actionName = Joiner.on("_").join(ACTION_PREFIX, array);
        if (!SpringContext.containsBean(actionName)) {
            throw new IllegalStateException("");
        }
        Action actionBean = SpringContext.getBean(actionName, Action.class);
        return actionBean.doProcess(request, response);
    }
}
