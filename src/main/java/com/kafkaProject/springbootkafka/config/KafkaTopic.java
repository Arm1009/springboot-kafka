import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Configuration class for defining Kafka topics.
 */
@Configuration
public class KafkaTopic {

    /**
     * Bean method for creating a new Kafka topic.
     *
     * @return A {JsonFormat NewTopic} instance representing the newly created Kafka topic.
     */
    @Bean
    public NewTopic JavaJsonTopic() {
        return TopicBuilder.name("JsonFormat")
                .build();
    }
}