package com.notificationservice.NotificationService.controller;

import com.notificationservice.NotificationService.model.Orders;
import com.notificationservice.NotificationService.service.NotificationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

@ExtendWith(MockitoExtension.class)
class NotifyControlTest {
    @Mock
    private NotificationService notificationService;
    @InjectMocks
    private NotifyControl notifyControl;

    @Test
    void receiveData() {
        //when it is not calling any method we can directly call a method
        Orders o = new Orders();
        notifyControl.receiveData(Collections.singletonList(o));
    }

    @Test
    void receivemultipledata() {
        Orders order = new Orders();
        notifyControl.receiveMultipleData(Collections.singletonList(order));
    }
}
