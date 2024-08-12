package com.rabbitMQ.controller;

import com.rabbitMQ.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    public MessageController(RabbitMQProducer producer) {
        this.producer = producer;
    }

    private RabbitMQProducer producer;

    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message send to RabbitMQ..");
    }
}
