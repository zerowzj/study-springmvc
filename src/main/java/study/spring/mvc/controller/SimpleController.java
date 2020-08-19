package study.spring.mvc.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 为什么SimpleController要继承Controller？
 * 因为SimpleUrlHandlerMapping对应的处理器是HandlerAdapter的子实现类SimpleControllerHandlerAdapter
 */
@Slf4j
@org.springframework.stereotype.Controller
public class SimpleController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.info("fadsfasdf");
        return null;
    }
}
