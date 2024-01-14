package com.learn.kafka.libraryEventProducer.domain;

public record LibraryEvent(
         Integer libraryEventId,
         LibraryEventType libraryEventType,
         Book book) {

}
