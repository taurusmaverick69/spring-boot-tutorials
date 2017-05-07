package com.maverick.controller;

import com.maverick.domain.Group;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)

public class GroupControllerTestIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void exampleTest() {
        Group[] body = restTemplate.getForObject("/", Group[].class);
        assertThat(body.length, is(11));
    }
}
