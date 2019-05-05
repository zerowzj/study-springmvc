package study.spring.support.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class MyAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyAspect.class);

    @Before("execution(* com.company.project.service..*.*(..))")

    public void before() {
        LOGGER.info("12313123123123123123123");
    }

    @After("execution(* com.company.project.service..*.*(..))")
    public void after() {
        LOGGER.info("abasfsadfasdfsafsfas");
    }
}
