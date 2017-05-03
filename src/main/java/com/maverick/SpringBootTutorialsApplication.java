package com.maverick;

import com.maverick.domain.Group;
import com.maverick.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTutorialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialsApplication.class, args);
    }

    @Autowired
    private EntityRepository<Group> entityRepository;

    @GetMapping
    public Object greeting() {
        Iterable<Group> all = entityRepository.findAll();
        return all;
    }
}
