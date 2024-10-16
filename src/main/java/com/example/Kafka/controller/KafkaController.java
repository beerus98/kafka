package com.example.Kafka.controller;

import com.example.Kafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    private ProducerService producerService;

    @GetMapping(value = "/message")
    public void getProducerMessageFromClient(@RequestParam(value = "message") String msg){
        producerService.sendMessageToTopic(msg);
    }
}
