package study.spring.mvc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import study.spring.mvc.service.UserService;
import study.spring.mvc.support.annotation.Api;
import study.spring.mvc.support.annotation.GetAction;
import study.spring.mvc.support.annotation.PostAction;

@Controller
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/test1")
    public String test1() {
        userService.checkIn(null);
        LOGGER.info("test1 test1");
        return "this is test1";
    }

    @RequestMapping("/test2")
    public String test2() {
        LOGGER.info("test2 test2");
        return "this is test2";
    }
}
