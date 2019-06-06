package study.spring.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import study.spring.service.UserService;

@Controller
@RequestMapping("/demo")
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/test1")
    public void test1() {
        userService.checkIn(null);
        LOGGER.info("test1 test1");
    }
}
