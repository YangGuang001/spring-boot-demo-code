package com.springboot.activemq.client;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by yz on 2018/1/6.
 */
public class Msg implements MessageCreator {
    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("test message");
    }
}
