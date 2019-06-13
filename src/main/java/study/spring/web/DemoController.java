package study.spring.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import study.spring.service.UserService;
import study.spring.support.annotation.Api;
import study.spring.support.annotation.GetAction;
import study.spring.support.annotation.PostAction;

@Api
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private UserService userService;

    @GetAction("/test1")
    public String test1() {
        userService.checkIn(null);
        LOGGER.info("test1 test1");
        return "this is test1";
    }

    @PostAction("/test2")
    public String test2() {
        LOGGER.info("test2 test2");
        return "this is test2";
    }
}
