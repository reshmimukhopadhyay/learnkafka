package com.learn.kafka.libraryEventProducer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }


    public void sendMessageToKafkaTopic(String message){
        log.info(String.format("Message sent %s",message));
        kafkaTemplate.send("Library_Event",message);
    }
}
