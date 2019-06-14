package study.spring.web.databind;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import study.spring.support.context.SpringContext;

@Controller
@RequestMapping("/databind")
@ResponseBody
public class DataBindController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataBindController.class);

    @RequestMapping("/path/{id}/{name}")
    public void pathVariable(String id1,
                             @PathVariable String name) {
        LOGGER.info("id={},name={}", id1, name);
    }

    @RequestMapping("/request")
    public void request(@RequestParam(required = false) String name,
                             @RequestHeader(value = "Request-Id", required = false) String requestId) {
        LOGGER.info("name={}, request_id={}", name, requestId);
    }

    @RequestMapping("/bean")
    public void bean(FormBean form) {
        LOGGER.info("name={}, age={}", form.getName(), form.getAge());
    }

    @RequestMapping("/bind4")
    public void bind4(@RequestBody MultiValueMap<String, String> map) {
        String[] str = SpringContext.getBeanNamesForType(HttpMessageConverter.class);
        LOGGER.info("name={}, age={}", map);
    }
}
