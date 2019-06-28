package study.spring.mvc.web.msgconver;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import study.spring.mvc.service.UserService;

import java.util.Map;

@Controller
@RequestMapping("/msgconver")
public class MsgConverController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MsgConverController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/text")
    @ResponseBody
    public String test1() {
        userService.checkIn(null);
        LOGGER.info("test1 test1");
        return "this is test1";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, Object> test2(Map<String, Object> params) {
        LOGGER.info("test2 test2");
        LOGGER.info("params={}", params);
        Map<String, Object> data = Maps.newHashMap();
        data.put("code", "0000");
        data.put("desc", "成功");
        return data;
    }
}
