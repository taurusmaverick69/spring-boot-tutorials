package com.maverick.repository;

import com.maverick.domain.Group;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupRepository extends CrudRepository<Group, Integer> {

    List<Group> findByName(String name);
}
