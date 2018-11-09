package com.company.project.support.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class RabbitReturnCallback implements RabbitTemplate.ReturnCallback {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitConfirmCallback.class);

    @Override
    public void returnedMessage(Message message, int replyCode, String replyText,
                                String exchange, String routingKey) {
        LOGGER.info("消息主体 message: {}", message);
        LOGGER.info("消息主体 message: {}", replyCode);
        LOGGER.info("描述：{}", replyText);
        LOGGER.info("消息使用的交换器 exchange: {}", exchange);
        LOGGER.info("消息使用的路由键 routing: {}", routingKey);
    }
}
