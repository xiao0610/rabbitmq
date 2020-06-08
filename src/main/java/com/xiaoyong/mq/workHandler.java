package com.xiaoyong.mq;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component

public class workHandler {
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void rabbitHandler1(String message) {
        System.out.println(message+"1");
    }

    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void rabbitHandler2(String message) {
        System.out.println(message+"2");
    }
}
