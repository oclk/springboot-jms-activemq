package com.oclk.jms.service;

import com.oclk.jms.entity.Simeranya;

public interface JmsService {
    public void send(Simeranya simeranya);

    public Simeranya receive();
}
