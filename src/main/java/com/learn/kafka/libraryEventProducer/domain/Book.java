package com.learn.kafka.libraryEventProducer.domain;

public record Book(
        Integer bookId,
        String bookName,
        String bookAuthor) {
}
