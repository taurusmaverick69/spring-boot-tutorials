package com.maverick.controller;

import com.maverick.domain.Group;
import com.maverick.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/group")
    public Iterable<Group> findAll() {
        return groupService.findAll();
    }
}
