package com.maverick.service;

import com.google.common.collect.ImmutableMap;
import com.maverick.domain.Group;
import com.maverick.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public Iterable<Group> findAll() {


       ImmutableMap.<String, Integer>builder().put("sdf", 1).build();

        String few = "fewsf";
        String s = "fd" + "fewf" + few;
        return groupRepository.findAll();

    }
}
