package com.notificationservice.NotificationService.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.record.TimestampType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NotificationServiceTest1 {
    @InjectMocks
    private NotificationService notificationService;
    @Mock
    private ConsumerRecord<String, String> record;

    @Test
    void testUserMessage() {
        String key="key";
        String value="value";
        notificationService.userMessage(record);
    }

    @Test
    void testReceiveMessage() {
         int id=1;
        notificationService.receiveMessage(1);
    }
}