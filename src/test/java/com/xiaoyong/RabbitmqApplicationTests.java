package com.xiaoyong;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqApplicationTests {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void hellowork() {
        rabbitTemplate.convertAndSend("hi", "hello1");
    }

    @Test
    void work() {
        rabbitTemplate.convertAndSend("work", "work");
    }

}
