package com.spring.boot.messaging.listener;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consume {

    @JmsListener(destination = "standalone.queue")
    public void consume(final String message){
        System.out.println("Received message as "+message);
    }
}
