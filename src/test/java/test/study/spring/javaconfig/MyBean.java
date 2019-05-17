package test.study.spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class MyBean {

    @Value("wangzhj")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
