package com.maverick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private SchedulingConfigurer schedulingConfigurer;
}
