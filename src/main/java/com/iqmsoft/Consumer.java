package com.iqmsoft;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "test_subject",groupId = "test_group")
    public void consumeMessage(String message){

        System.out.println("Consumer Received " +  message);
    }
}
