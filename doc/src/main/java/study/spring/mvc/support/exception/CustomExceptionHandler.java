package study.spring.mvc.support.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import study.spring.mvc.support.Results;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 异常处理器
 *
 * @author wangzhj
 */
//@ControllerAdvice
public class CustomExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public Map<String, Object> resolveException(HttpServletRequest request, HttpServletResponse response,
                                                Exception ex) {
//        LOGGER.error("发生异常", ex);
        LOGGER.info("2222222222222222222");
        return Results.error();
    }
}
