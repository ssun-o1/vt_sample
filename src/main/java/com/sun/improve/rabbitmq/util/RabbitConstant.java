package com.sun.improve.rabbitmq.util;

public interface RabbitConstant {

    /**
     * 交换机
     */
    interface Exchanges {
        /**
         * 延时交换机
         */
        String delayedExchange = "spring.boot.delay.exchange";
    }

    /**
     * 队列
     */
    interface Queues {
        /**
         * 延时队列（通过延时插件实现）
         */
        String delayedQueue = "spring.boot.delay.queue";
    }

    /**
     * 路由key
     */
    interface RouterKey {
        /**
         * 延时路由key
         */
        String delayedRouteKey = "delayed.route.key";
    }

}
