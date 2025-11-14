package com.moray.taskscheduler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskSchedulerHealthCheck {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

}
