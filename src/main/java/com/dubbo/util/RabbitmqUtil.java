package com.dubbo.util;

import com.dubbo.commons.RabbitmqConfig;

public class RabbitmqUtil {

    public void setMessage(Byte[] message) throws Exception{

        RabbitmqConfig.getChannel().exchangeDeclare("exchangeName","direct",true);

        RabbitmqConfig.getChannel().queueDeclare("queueName",true,false,false,null);

        RabbitmqConfig.getChannel().queueBind("exchangeName","queueName","rounting");
    }
}
