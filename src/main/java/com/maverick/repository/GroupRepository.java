package com.maverick.repository;

import com.maverick.domain.Group;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface GroupRepository extends PagingAndSortingRepository<Group, Integer> {

    List<Group> findByName(String name);
}
