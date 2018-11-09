package test.com.company.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml", "classpath:spring/spring-dao.xml"})
public class SpringRabbitMQ_Test {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    static String[] FILES = new String[]{"classpath:spring/spring-context.xml", "classpath:spring/spring-dao.xml"};

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(FILES);
        RabbitTemplate rabbitTemplate = (RabbitTemplate) cxt.getBean("rabbitTemplate");
        rabbitTemplate.convertAndSend("sddddddddddddfsdf");
    }

    @Test
    public void test() {
//        Message msg = new Message();
        rabbitTemplate.convertAndSend("sddddddddddddfsdf");
    }
}
