package org.sid.kafkaappspring;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private int counter;
    private KafkaTemplate<String, String> kafkaTemplate;

    public MyRestController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/send/{message}/{topicName}")
    public String send(@PathVariable String message,
                       @PathVariable String topicName) {
        kafkaTemplate.send(topicName, String.valueOf(++counter), message);
        return "Message sent successfully !";
    }
}
