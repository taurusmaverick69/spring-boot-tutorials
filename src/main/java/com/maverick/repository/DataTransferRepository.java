package com.maverick.repository;

import com.maverick.domain.DataTransfer;
import org.springframework.data.repository.CrudRepository;

public interface DataTransferRepository extends CrudRepository<DataTransfer, String> {
}
