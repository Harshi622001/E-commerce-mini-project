package com.userservice.Userservice.controller;

import com.userservice.Userservice.service.Userservice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)


class UserControllerTest {
    @Mock
    private Userservice userservice;
    @InjectMocks
    private UserController userController;
    @Test
    void registerUser() {
        String username="harshitha";
        Mockito.doNothing().when(userservice).register("harshi");
        userController.registerUser("harshi");
        Mockito.verify(userservice,Mockito.times(1)).register("harshi");

    }
}