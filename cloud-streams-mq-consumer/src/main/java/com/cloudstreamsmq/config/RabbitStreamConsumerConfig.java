package com.cloudstreamsmq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class RabbitStreamConsumerConfig {

    @Bean
    public Consumer<String> slowSink() {
        return message -> {
            log.info("Received message: {}", message);
        };
    }

}
