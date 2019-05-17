package test.study.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "test.study.spring.javaconfig")
public class SpringConfig {

    @Bean
    public MyBean bean() {
        return new MyBean();
    }
}
