package com.binary.microservices.table_service.repository;

import com.binary.microservices.table_service.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Table,String> {

}
