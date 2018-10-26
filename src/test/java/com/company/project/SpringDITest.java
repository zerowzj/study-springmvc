package com.company.project;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringDITest extends SpringTestBase {

    @Autowired
    private DIBean bean;

    @Test
    public void test_() {
        LOGGER.info("str={}", bean.getStr());
        LOGGER.info("int={}", bean.getaInteger());
        LOGGER.info("boolean={}", bean.getaBoolean());
        LOGGER.info("arrays={}", bean.getStrs());
        LOGGER.info("list={}", bean.getList());
        LOGGER.info("map={}", bean.getMap());
        LOGGER.info("prop={}", bean.getProp());
    }
}
