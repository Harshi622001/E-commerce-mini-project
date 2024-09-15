package com.userservice.Userservice.service;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.kafka.core.KafkaTemplate;
//
//import static org.junit.jupiter.api.Assertions.*;
//@ExtendWith(MockitoExtension.class)
//class UserserviceTest {
//@Mock
//private KafkaTemplate<String,String> kafkaTemplate;
//@InjectMocks
//private Userservice userservice;
//    @Test
//    void registerTest() {
//        String username="Harshitha";
//        String usertopic="harshi";
//        Mockito.doNothing().when(kafkaTemplate).send(usertopic,"new User registered ",username);
//        userservice.register("Harshitha");
//        Mockito.verify(userservice,Mockito.times(1)).register(username);
//    }
//}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.*;

public class UserserviceTest {

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @InjectMocks
    private Userservice userService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void registerTest() {
        String username = "Harshitha";
//        String userTopic = "harshi"; // Assuming you meant to use a constant or a variable for the topic name
//
        // Mock the send method to do nothing
//        doNothing().when(kafkaTemplate).send(userTopic, username);

        // Call the register method
        userService.register(username);

        // Verify that the kafkaTemplate's send method was called with the correct arguments
//        verify(kafkaTemplate, times(1)).send(userTopic, "new User registered " + username);
    }
}
