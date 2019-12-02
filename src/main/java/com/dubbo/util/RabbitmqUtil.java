package com.dubbo.util;

import com.dubbo.commons.RabbitmqConfig;
import com.rabbitmq.client.BuiltinExchangeType;

public class RabbitmqUtil {
    /**
     * 队列名称
     * 声明持久化队列，durable = true
     * 声明排他队列，exclusive = true
     * （自动删除）属性开启，autoDelete = true
     *
     * 在声明队列方法的入参中，存在一个称为“arguments”的参数，该参数以键值对的形式，可为队列设置多种属性。
     * 以“arguments”入参声明的队列，同样须以相同的属性和值为参数进行连接。可为队列设置以下参数。
     *  　x-message-ttl：队列中消息的生存周期，单位毫秒，设置该属性后，队列对每条消息自接收开始起计时，超过设置的时间值后，自动删除该消息；
     *  　x-expires：队列闲置时间，单位毫秒，若队列在指定的时间内没有被访问，则会自动删除；
     *  　x-max-length：队列的最大长度，即队列存放消息的最大数目，若接收消息后队列的消息数超过指定的队列最大长度，则将最早的消息移出队列；
     *  　x-max-length-bytes：队列最大占用空间，单位字节，若接收消息后队列的占用空间超过指定的队列最大占用空间，则将最早的消息移出队列；
     *  　x-dead-letter-exchange、x-dead-letter-routing-key：设置这两个参数后，
     * 当队列超过指定长度或占用空间大小时，对于移出的较早的消息，将其以指定的路由键发送至指定的交换机，而不直接删除，
     *    x-dead-letter-exchange指定交换机名称，x-dead-letter-routing-key指定路由键；
     *  　x-max-priority：优先级队列，指定队列的最大优先级，可在发布消息的时候指定消息的优先级，优先级更高（数值更大的）的消息先被消费，
     * 使用见后续消息章节；
     *  　x-queue-mode：队列模式，分为默认（default）和延迟（lazy）两种，当该值设置为“lazy”时，消息将先保存到磁盘上、不放在内存中，
     * 当消费者开始消费的时候才加载到内存中。
     */
    public void setMessage(Byte[] message) throws Exception{
        //声明交换机
        RabbitmqConfig.getChannel().exchangeDeclare("exchangeUser", BuiltinExchangeType.DIRECT);
        //声明队列
        RabbitmqConfig.getChannel().queueDeclare("queueName",true,false,false,null);
        //绑定队列和交换机
        RabbitmqConfig.getChannel().queueBind("exchangeName","queueName","rounting");
    }
}
