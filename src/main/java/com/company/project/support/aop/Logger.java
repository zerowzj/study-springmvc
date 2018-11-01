package com.company.project.support.aop;

import org.slf4j.LoggerFactory;

public class Logger {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Monitor.class);

    public void doBefore() {
        LOGGER.info("Before Before");
    }
}
