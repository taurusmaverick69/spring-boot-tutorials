package com.maverick.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<String> getStatus() {
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 1) {
            return new ResponseEntity<>("INTERNAL_SERVER_ERROR", INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("OK", OK);
    }
}
