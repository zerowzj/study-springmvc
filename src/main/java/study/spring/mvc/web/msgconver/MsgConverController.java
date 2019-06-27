package study.spring.mvc.web.msgconver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import study.spring.mvc.service.UserService;

@Controller
public class MsgConverController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MsgConverController.class);

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
