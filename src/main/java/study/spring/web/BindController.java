package study.spring.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bind")
@ResponseBody
public class BindController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BindController.class);

    @RequestMapping("/{id}/{name}")
    public void bind1(String id1,
                      @PathVariable String name) {
        LOGGER.info("id={},name={}", id1, name);
    }

    @RequestMapping("/bind2")
    public void bind2(@RequestParam(required = false) String name,
                      @RequestHeader(value = "Request-Id", required = false) String requestId) {
        LOGGER.info("name={}, request_id={}", name, requestId);
    }

    @RequestMapping("/bind3")
    public void bind3(FormBean form) {
        LOGGER.info("name={}, age={}", form.getName(), form.getAge());
    }

    @RequestMapping("/bind4")
    public void bind4(@RequestBody FormBean form) {
        LOGGER.info("name={}, age={}", form.getName(), form.getAge());
    }
}
