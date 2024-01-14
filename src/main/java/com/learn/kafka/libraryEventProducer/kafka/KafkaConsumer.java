package com.learn.kafka.libraryEventProducer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    public static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics="Library_Event",groupId = "myGroup")
    public void consumeMessageFromKafkaTopic(String message){
        log.info(String.format("Message received -> %s",message));
    }
}
