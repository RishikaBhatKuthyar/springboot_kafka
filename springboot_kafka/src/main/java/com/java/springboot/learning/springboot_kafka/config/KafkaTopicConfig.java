package com.java.springboot.learning.springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}")
    private String topicName;


    @Value("${spring.kafka.topic-json.name}")
    private String topicName_json;
    @Bean
    public NewTopic topic1(){
        return TopicBuilder.name(topicName)
//                .partitions(10)
                .build();
    }

    @Bean
    public NewTopic topic1_json(){
        return TopicBuilder.name(topicName_json)
//                .partitions(10)
                .build();
    }
}
