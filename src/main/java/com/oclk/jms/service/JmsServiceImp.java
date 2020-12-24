package com.oclk.jms.service;

import com.oclk.jms.consumer.JmsConsumer;
import com.oclk.jms.entity.Simeranya;
import com.oclk.jms.producer.JmsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JmsServiceImp implements JmsService {
    @Autowired
    private JmsProducer jmsProducer;

    @Autowired
    private JmsConsumer jmsConsumer;

    @Override
    public void send(Simeranya simeranya) {
        jmsProducer.send(simeranya);
    }

    @Override
    public Simeranya receive() {
        return jmsConsumer.receive();
    }
}
