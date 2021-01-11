package org.sid.kafkaappspring;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    /*Listener sur la topic*/
    @KafkaListener(topics = "kafka_topic_1", groupId = "group-1")
    public void onMessage(ConsumerRecord<String,String> message){
        System.out.println("> Receiving new record : ");
        System.out.println("\tKey : " + message.key());
        System.out.println("\tValue : " + message.value());
    }
}
