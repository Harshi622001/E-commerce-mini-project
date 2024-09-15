package com.userservice.Userservice.service;

import com.userservice.Userservice.appconstant.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//producer
@Service
public class Userservice {
    @Autowired
    public KafkaTemplate<String, String> kafkaTemplate;

    //when where User registered they will be able to access the product
    public void register(String username) {
        this.kafkaTemplate.send(User.TOPIC_NAME, "new User registered " + username);
    }

}
