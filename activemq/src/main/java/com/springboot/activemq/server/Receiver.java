package com.springboot.activemq.server;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by yz on 2018/1/6.
 */
@Component
public class Receiver {

    @JmsListener(destination = "my-destination")
    public void ReceiverMessage(String message) {
        System.out.println("Receiver message : " + message);
    }
}
