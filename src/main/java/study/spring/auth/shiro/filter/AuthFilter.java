package study.spring.auth.shiro.filter;

import org.apache.shiro.web.servlet.AdviceFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import study.spring.common.util.HttpServlets;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 认证过滤器
 *
 * @author wangzhj
 */
public class AuthFilter extends AdviceFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthFilter.class);

    @Override
    protected boolean preHandle(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {

        LOGGER.info("I am AuthFilter!");

        HttpServletRequest request = HttpServlets.toHttp(servletRequest);
        HttpServletResponse response = HttpServlets.toHttp(servletResponse);
        Map<String, Object> paramMap = request.getParameterMap();
        try {
            //token过期或失效
//            if ("".equals("")) {
//                HttpWrites.write(response, "");
//                return false;
//            }
        } catch (Exception ex) {
            throw ex;
        }
        return true;
    }

    @Override
    protected void postHandle(ServletRequest request, ServletResponse response) throws Exception {
        LOGGER.info("postHandle......");
    }

    @Override
    public void afterCompletion(ServletRequest servletRequest, ServletResponse servletResponse, Exception ex) throws Exception {

    }
}
