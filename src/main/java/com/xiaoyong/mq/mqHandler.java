package com.xiaoyong.mq;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.apache.commons.logging.Log;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queuesToDeclare = @Queue("hi"))
public class mqHandler {
    @RabbitHandler
    public void rabbitHandler(String message) {
        //第二次冲突
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        //创建冲突
    }
}
