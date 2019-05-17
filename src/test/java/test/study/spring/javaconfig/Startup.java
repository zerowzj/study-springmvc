package test.study.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Startup {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        context.register(SpringConfig.class);//注册单个配置类
//        context.register(ServiceConfig.class, DaoConfig.class);//注册多个配置类
//        context.refresh();             //注册完后一定要refresh()一次

        MyBean bean  = context.getBean(MyBean.class);
        System.out.println(bean.getName());

    }
}
