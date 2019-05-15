package study.spring.support.action;

import study.spring.support.context.SpringContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Action执行器
 *
 * @author wangzhj
 */
@Deprecated
public class ActionExecutors {

    /**
     * 执行Action
     *
     * @param request  Http请求
     * @param response Http响应
     * @param clazz    执行类
     * @return Map
     */
    public static Map<String, Object> execute(HttpServletRequest request, HttpServletResponse response,
                                              Class<? extends Action> clazz) {
        Action action = SpringContext.getBean(clazz);
        if (action == null) {
            throw new IllegalStateException(String.format("action bean[%s] not exist!", clazz.getSimpleName()));
        }
        return action.doProcess(request, response);
    }

    /**
     * 执行Action
     *
     * @param request  Http请求
     * @param response Http响应
     * @param name     执行类名称
     * @return Map
     */
    public static Map<String, Object> execute(HttpServletRequest request, HttpServletResponse response,
                                              String name) {
        Action action = SpringContext.getBean(name);
        if (action == null) {
            throw new IllegalStateException(String.format("action bean[%s] not exist!", name));
        }
        return action.doProcess(request, response);
    }
}
