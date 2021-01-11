package org.sid.kafkaappspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaAppSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaAppSpringApplication.class, args);
    }

}
