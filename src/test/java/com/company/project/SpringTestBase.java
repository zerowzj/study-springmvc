package com.company.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context.xml")
public class SpringTestBase {

    @Autowired
    private DIBean bean;

    @Test
    public void test_(){
        System.out.println(bean.getName());
        System.out.println(bean.getAge());
        System.out.println(bean.isGood());
    }
}
