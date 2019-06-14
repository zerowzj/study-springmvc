package study.spring.web.strategy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import study.spring.support.context.SpringContext;

@Controller
@RequestMapping("/strategy")
@ResponseBody
public class StrategyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StrategyController.class);

    @RequestMapping
    public void bind1() {
        LOGGER.info("{}", SpringContext.getBeansOfType(HandlerMapping.class));
//        String[] handlerMapping = SpringContext.getBeanNamesForType(HandlerMapping.class);
//        String[] handlerAdapter = SpringContext.getBeanNamesForType(HandlerAdapter.class);
//        LOGGER.info("handlerMapping={}", handlerMapping);
//        LOGGER.info("handlerAdapter={}", handlerAdapter);
//        String[] httpMessageConverter = SpringContext.getBeanNamesForType(HttpMessageConverter.class);
//        LOGGER.info("httpMessageConverter={}", httpMessageConverter);
    }
}
