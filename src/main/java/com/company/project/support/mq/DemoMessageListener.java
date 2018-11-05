package com.company.project.support.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class DemoMessageListener implements MessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoMessageListener.class);

    @Override
    public void onMessage(Message message) {

    }
}
