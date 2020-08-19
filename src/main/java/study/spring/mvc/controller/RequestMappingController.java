package study.spring.mvc.controller;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class RequestMappingController {

    @RequestMapping(value = "/sayHi")
    @ResponseBody
    public String sayHi() {
        return "hi";
    }

    @RequestMapping(value = "/sayBye")
    @ResponseBody
    public Map<String, Object> sayBye() {
        Map<String, Object> data = Maps.newHashMap();
        data.put("code", "000");
        return data;
    }
}
