package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by archerlj on 2017/6/21.
 */
@Component
@RabbitListener(queues = TopicRabbitConfig.message)
public class Reciver1 {

    @RabbitHandler
    public void process(String txt) {
        System.out.println("reciver 1 : " + txt);
    }
}
