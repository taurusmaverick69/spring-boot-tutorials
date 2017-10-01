package com.maverick.service;

import com.maverick.domain.Group;
import com.maverick.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public Iterable<Group> findAll() {
        return groupRepository.findAll();
    }
}
