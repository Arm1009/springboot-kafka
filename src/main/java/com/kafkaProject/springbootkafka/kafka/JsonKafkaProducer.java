package com.kafkaProject.springbootkafka.kafka;

import com.kafkaProject.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Service class for producing messages to a Kafka topic in JSON format.
 */
@Service
public class JsonKafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;

    /**
     * Constructor for the JsonKafkaProducer class.
     *
     * @param kafkaTemplate An instance of { KafkaTemplate} for sending messages to Kafka.
     */
    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    /**
     * Method to send a JSON message to the Kafka topic.
     *
     * @param data The {User} object representing the JSON message to be sent.
     */
    public void sendMessage(User data){
        LOGGER.info(String.format("Message sent -> %s", data.toString()));
        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC,"JsonFormat")
                .build();

        kafkaTemplate.send(message);
    }
}
