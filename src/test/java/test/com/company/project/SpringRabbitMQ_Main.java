package test.com.company.project;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRabbitMQ_Main {

    static String[] FILES = new String[]{"classpath:spring/spring-context.xml", "classpath:spring/spring-dao.xml"};

    public static void main(String[] args) {

        ApplicationContext cxt = new ClassPathXmlApplicationContext(FILES);
        RabbitTemplate rabbitTemplate = (RabbitTemplate) cxt.getBean("rabbitTemplate");
        rabbitTemplate.convertAndSend("my_routing_key", "ssssssssssssssss");
    }
}
