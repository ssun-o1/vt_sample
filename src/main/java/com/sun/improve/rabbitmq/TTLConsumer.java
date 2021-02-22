package com.sun.improve.rabbitmq;

import com.sun.improve.rabbitmq.util.RabbitConstant;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class TTLConsumer {

//    @RabbitListener(queues = RabbitConstant.Queues.delayedQueue)
//    public void delayedConsumer(String message) {
//        System.out.println("消费了一条消息，消费时间： "
//                + DateTimeFormatter.ofPattern("HH:mm:ss")
//                .format(LocalTime.now()));
//        System.out.println(message);
//
//    }
}
