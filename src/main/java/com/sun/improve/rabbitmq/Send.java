package com.sun.improve.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.data.solr.core.query.result.FacetAndHighlightPage;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        //创建连接到mq
        ConnectionFactory factory = new ConnectionFactory();
        //设置mq的主机ip或者主机名
        factory.setHost("39.97.106.72");
        //创建一个连接
        Connection connection = factory.newConnection();
        //创建一个通道
        Channel channel = connection.createChannel();
        //指定一个队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //发送消息
        String message = "hello world!!";
        //向队列中发送一个消息
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] sent ' "+message+" '");
        //关闭通道和连接
        channel.close();
        connection.close();

    }

}
