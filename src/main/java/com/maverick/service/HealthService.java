package com.maverick.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class HealthService {

    private int attempt;

    public void clearAttemt() {
        attempt = 0;
    }

    @Retryable(maxAttempts = 2, value = IOException.class, backoff = @Backoff(delay = 500, multiplier = 2))
    public String getHealth() {
        attempt++;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8080/health", String.class) + " ---- " + attempt;
    }

    @Recover
    public String recover() {
        return "NOT OK";
    }
}
