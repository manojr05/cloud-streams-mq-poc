package com.cloudstreamsmq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
@Slf4j
public class RabbitStreamSupplierConfig {

    @Bean
    public Supplier<String> slowSource() {
        return () -> {
            String message = "Test";
            log.info("Sending value: {}", message);
            return message;
        };
    }

}
