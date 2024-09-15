//package com.notificationservice.NotificationService.service;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.ArgumentCaptor;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.*;
//
//@ExtendWith(MockitoExtension.class)
//class NotificationServiceTest {
//    // No need to mock Logger as it's not injected
//    @InjectMocks
//    private NotificationService notificationService;
//
//    @Mock
//    private ConsumerRecord<String, String> record;
//
//    @Test
//    void receiveMessage() {
//        int id = 123;
//        notificationService.receiveMessage(id);
//
//        // Verify logging using Mockito ArgumentCaptor (assuming specific logging format)
//        ArgumentCaptor<String> logMessageCaptor = ArgumentCaptor.forClass(String.class);
//        Mockito.verify(notificationService.log, Mockito.times(1)).info(logMessageCaptor.capture());
//        String capturedMessage = logMessageCaptor.getValue();
//        assertEquals("Received ID " + id, capturedMessage);
//    }
//
//}
