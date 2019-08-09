package study.spring.mvc.web.strategy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import study.spring.mvc.support.context.SpringContext;

@Controller
@RequestMapping("/strategy")
@ResponseBody
public class StrategyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StrategyController.class);

    @RequestMapping
    public void strategy() {
        LOGGER.info("{}", SpringContext.getBeansOfType(HandlerMapping.class));
        WebApplicationContext wac;
        String[] handlerMapping = SpringContext.getBeanNamesForType(HandlerMapping.class);
        LOGGER.info("handler_mapping ===> {}", handlerMapping);
        String[] handlerAdapter = SpringContext.getBeanNamesForType(HandlerAdapter.class);
        LOGGER.info("handler_adapter ===> {}", handlerAdapter);

        String[] multipartResolver = SpringContext.getBeanNamesForType(MultipartResolver.class);
        LOGGER.info("multipart_resolver ===> {}", multipartResolver);
        String[] viewResolver = SpringContext.getBeanNamesForType(ViewResolver.class);
        LOGGER.info("view_resolver ===> {}", viewResolver);

        String[] exceptionResolver = SpringContext.getBeanNamesForType(HandlerExceptionResolver.class);
        LOGGER.info("exception_resolver ===> {}", exceptionResolver);
//
//        String[] httpMessageConverter = SpringContext.getBeanNamesForType(HttpMessageConverter.class);
//        LOGGER.info("Http Message Converter={}", httpMessageConverter);
    }
}
