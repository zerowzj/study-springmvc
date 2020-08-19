package study.spring.mvc.support.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class WatchDogInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatchDogInterceptor.class);

    public WatchDogInterceptor() {
        LOGGER.info("WatchDogInterceptorWatchDogInterceptor");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        Enumeration<String> headerNames = request.getHeaderNames();
        LOGGER.info("===============");
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            LOGGER.info("{}= {}", headerName, request.getHeader(headerName));
        }
        LOGGER.info("===============");
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                LOGGER.info("{}= {}", cookie.getName(), cookie.getValue());
            }
        }
        return true;
    }
}
