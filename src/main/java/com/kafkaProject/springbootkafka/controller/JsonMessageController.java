package com.kafkaProject.springbootkafka.controller;

import com.kafkaProject.springbootkafka.kafka.JsonKafkaProducer;
import com.kafkaProject.springbootkafka.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling HTTP requests related to publishing JSON messages to a Kafka topic.
 */
@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    /**
     * Constructor for the JsonMessageController class.
     *
     * @param kafkaProducer An instance of {JsonKafkaProducer} used for sending messages to Kafka.
     */
    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    /**
     * Handler method for HTTP POST requests to publish JSON messages to a Kafka topic.
     *
     * @param user The { User} object representing the JSON message to be published.
     * @return A { ResponseEntity} with a message indicating the status of the operation.
     */
    //http:localhost:8080/api/v1/kafka/publish
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}
