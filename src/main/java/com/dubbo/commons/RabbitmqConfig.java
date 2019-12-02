package com.dubbo.commons;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitmqConfig {

    // RabbitMQ服务端地址
    private static final String ADDRESS = "172.18.0.7";
    // RabbitMQ默认监听端口为5672
    private static final int PORT = 5672;
    // 使用第一章创建的用户zhuqingchun进行登录
    private static final String USERNAME = "zhuqingchun";
    private static final String PASSWORD = "729512117";

    private static ConnectionFactory factory;

    private static Channel channel;

    static {
        factory=new ConnectionFactory();
        factory.setHost(ADDRESS);
        factory.setPort(PORT);
        factory.setUsername(USERNAME);
        factory.setPassword(PASSWORD);
        factory.setVirtualHost("/");
        try {
            Connection connection = factory.newConnection();
            channel= connection.createChannel();
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }

    public static Channel getChannel(){
        return channel;
    }

}
