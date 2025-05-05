package com.binary.microservices.table_service.service;

import com.binary.microservices.table_service.model.Table;

public interface TableService {
    Table getTable(String tableId);
    Table updateAvailability(String tableId, boolean available);
}