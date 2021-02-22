package com.sun.improve.rabbitmq;

import com.sun.improve.rabbitmq.util.RabbitConstant;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TTLProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送一条延时消息
     */
    public void sendDelayedMessage(String message) {
        rabbitTemplate.convertAndSend(
                RabbitConstant.Exchanges.delayedExchange,
                RabbitConstant.RouterKey.delayedRouteKey,
                message,
                msg->{
                    // 设置消息延时10秒
                    msg.getMessageProperties().setHeader("x-delay", 1000);
                    return msg;
                }
        );
    }
}
