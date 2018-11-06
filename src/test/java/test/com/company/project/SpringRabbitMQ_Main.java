package test.com.company.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRabbitMQ_Main {

    static String[] FILES = new String[]{"classpath:spring/spring-context.xml", "classpath:spring/spring-dao.xml"};

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext(FILES);
        cxt.start();
    }
}
