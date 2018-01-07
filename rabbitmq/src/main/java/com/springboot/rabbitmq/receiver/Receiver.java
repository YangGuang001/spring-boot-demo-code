package com.springboot.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by yz on 2018/1/6.
 */
@Component
public class Receiver {

    @RabbitListener(queues = "my-queue")
    public void receivermessage(String message) {
        System.out.println("Receiver message : " + message);
    }
}
