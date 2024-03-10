package com.kafkaProject.springbootkafka.kafka;

import com.kafkaProject.springbootkafka.kafka.JsonKafkaProducer;
import com.kafkaProject.springbootkafka.payload.User;
import com.kafkaProject.springbootkafka.repository.UserDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Service class for consuming messages from a Kafka topic in JSON format.
 */
@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private UserDataRepository userDataRepository;

    /**
     * Constructor for the JsonKafkaConsumer class.
     *
     * @param userDataRepository An instance of {UserDataRepository} for data access.
     */
    public JsonKafkaConsumer(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    /**
     * Kafka listener method to consume JSON messages from the "JsonFormat" topic.
     *
     * @param user The {User} object representing the JSON message received from Kafka.
     */
    @KafkaListener(
            topics = "JsonFormat",
            groupId = "consumerGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message received -> %s", user.toString()));

        User user1 = new User();
        userDataRepository.save(user1);
    }
}