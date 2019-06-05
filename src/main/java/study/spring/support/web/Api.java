package study.spring.support.web;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Api注解
 *
 * @author wangzhj
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public @interface Api {

    @AliasFor
    String value() default "";
}
