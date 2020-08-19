package study.spring.mvc.web.databind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/databind")
@ResponseBody
public class DataBindController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataBindController.class);

    @RequestMapping("/path_variable/{id}/{name}")
    public void pathVariable(String id1,
                             @PathVariable String name) {
        LOGGER.info("id={},name={}", id1, name);
    }

    @RequestMapping("/request_param")
    public void requestParam(@RequestParam(required = false) String name,
                             @RequestHeader(value = "Request-Id", required = false) String requestId) {
        LOGGER.info("name={}, request_id={}", name, requestId);
    }

    @RequestMapping("/bean")
    public void bean(FormBean form) {
        LOGGER.info("name={}, age={}", form.getName(), form.getAge());
    }

    @RequestMapping("/request_body")
    public void requestBody(@RequestBody MultiValueMap<String, String> map) {
        LOGGER.info("name={}, age={}", map);
    }
}
