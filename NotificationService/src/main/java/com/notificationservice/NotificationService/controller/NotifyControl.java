package com.notificationservice.NotificationService.controller;

import com.notificationservice.NotificationService.model.Orders;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.notificationservice.NotificationService.service.NotificationService;

import java.util.List;

@RestController
@RequestMapping("/notify")
public class NotifyControl {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("orders")
    public String receiveData(@RequestBody List<Orders> ordersList) {
        return "Received order: " + ordersList;
    }

    @PostMapping("orders1")
    public Orders receiveMultipleData(@RequestBody List<Orders> ordersList1) {

        return ordersList1.get(0);
    }
}
