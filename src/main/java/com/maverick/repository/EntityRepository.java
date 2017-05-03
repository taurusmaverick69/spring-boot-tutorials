package com.maverick.repository;

import com.maverick.domain.Entity;
import org.springframework.data.repository.CrudRepository;

public interface EntityRepository<T extends Entity> extends CrudRepository<T, Integer> {
}
