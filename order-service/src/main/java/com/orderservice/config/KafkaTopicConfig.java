package com.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    // Spring Bean For Kafka Topic
    @Bean // Spring will recognize this method as a bean thanks to this method
    public NewTopic topic() {
        return TopicBuilder.name(topicName)
                .build(); //this will create an instance of new topic
    }
}
