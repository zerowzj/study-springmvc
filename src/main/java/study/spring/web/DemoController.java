package study.spring.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import study.spring.service.UserService;
import study.spring.support.web.Api;

@Api
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/test1")
    public void test1() {
        userService.checkIn(null);
        LOGGER.info("test1 test1");
    }

    @RequestMapping(value = "/test2", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test2() {
        userService.checkIn(null);
        LOGGER.info("test2 test2");
        return "this is a test";
    }
}
