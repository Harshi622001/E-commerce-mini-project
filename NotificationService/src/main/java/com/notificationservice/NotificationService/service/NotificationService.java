package com.notificationservice.NotificationService.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class NotificationService {
    public static final Logger log = LoggerFactory.getLogger(NotificationService.class);

    @KafkaListener(topics ="usertopic",
            groupId = "group1")
    public void userMessage(ConsumerRecord<String, String> record) {
        String key = record.key();
        String value = record.value();
        log.info("Key: {} and Message: {} ", key, value);
    }
@Scheduled(fixedRate = 1000L)
    public void receiveMessage(int id)
{
        log.info("Received ID {}", id);
    }
}
