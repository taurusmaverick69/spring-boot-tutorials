package com.maverick.service;

import com.maverick.domain.Group;
import com.maverick.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public Iterable<Group> findAll() {
        return groupRepository.findAll();
    }

    public static void main(String[] args) {

        System.out.println(ManagementFactory.getRuntimeMXBean().getName());

    }
}
