package com.maverick.controller;

import com.maverick.domain.Group;
import com.maverick.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private GroupRepository groupRepository;

    @GetMapping
    public Group test() {
        Group group = new Group();
        group.setName("asd");
        return groupRepository.save(group);
    }


}
