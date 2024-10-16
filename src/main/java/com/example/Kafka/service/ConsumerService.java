package com.example.Kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "kafka_Topic" ,groupId = "kafka_group")
    public void listenToTopic(String msg){

        System.out.println("Message Received:"+msg);
    }
}
