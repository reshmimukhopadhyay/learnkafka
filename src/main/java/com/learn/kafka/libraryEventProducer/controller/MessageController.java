package com.learn.kafka.libraryEventProducer.controller;

import com.learn.kafka.libraryEventProducer.kafka.KafkaProducer;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer){
        this.kafkaProducer=kafkaProducer;
    }


    @GetMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message){
        kafkaProducer.sendMessageToKafkaTopic(message);
        return ResponseEntity.ok("Message sent to topic");
    }
}
