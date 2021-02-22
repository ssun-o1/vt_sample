package com.sun.improve.rabbitmq.controller;

import com.sun.improve.rabbitmq.TTLProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/ttl")
public class TTLProducerController {
    @Autowired
    private TTLProducer producer;

    @GetMapping("/sendDelayedMsg")
    public String sendDelayedMsg() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        StringBuilder message = new StringBuilder("这是一条延时消息，消息的发送时间为：");
        message.append(timeFormatter.format(LocalTime.now()));
        producer.sendDelayedMessage(message.toString());
        return "i'm ok";
    }
}
