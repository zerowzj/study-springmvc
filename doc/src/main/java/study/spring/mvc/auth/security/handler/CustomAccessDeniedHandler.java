package study.spring.mvc.auth.security.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 访问拒绝处理器
 *
 * @author wangzhj
 */
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    private static final Log LOGGER = LogFactory.getLog(CustomAccessDeniedHandler.class);

    private String errorPage;

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {

        String ajaxRequest = request.getHeader("X-Requested-With");
        // Set the 403 status code.
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        if ("XMLHttpRequest".equals(ajaxRequest)) {
            LOGGER.info("ssssssssssssssssssss");

        } else {
            // Put exception into request scope (perhaps of use to a view)
            request.setAttribute(WebAttributes.ACCESS_DENIED_403, accessDeniedException);
            // Set the 403 status code.
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            // forward to error page.
            RequestDispatcher dispatcher = request.getRequestDispatcher(errorPage);
            dispatcher.forward(request, response);
        }
    }

    public void setErrorPage(String errorPage) {
        if ((errorPage != null) && !errorPage.startsWith("/")) {
            throw new IllegalArgumentException("errorPage must begin with '/'");
        }

        this.errorPage = errorPage;
    }
}
