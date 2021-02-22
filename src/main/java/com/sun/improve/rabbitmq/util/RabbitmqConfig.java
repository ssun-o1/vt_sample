package com.sun.improve.rabbitmq.util;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.CustomExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class RabbitmqConfig {
    @Bean("delayedExchange")
    public CustomExchange delayExchange() {
        Map<String, Object> args = new HashMap<>(10);
        args.put("x-delayed-type", "direct");
        return new CustomExchange(RabbitConstant.Exchanges.delayedExchange, "x-delayed-message", true, false, args);
    }

    @Bean("delayedQueue")
    public Queue queue() {
        return new Queue(RabbitConstant.Queues.delayedQueue);
    }

    /**
     * 绑定延时队列和延时交换机（延时插件实现方式）
     *
     * @param delayedQueue delayedQueue
     * @param delayedExchange delayedExchange
     * @return Binding
     */
    @Bean
    public Binding delayedQueue_delayedExchange(
            @Qualifier("delayedQueue") Queue delayedQueue,
            @Qualifier("delayedExchange")CustomExchange delayedExchange){
        return BindingBuilder.bind(delayedQueue)
                .to(delayedExchange)
                .with(RabbitConstant.RouterKey.delayedRouteKey)
                .noargs();
    }
}
