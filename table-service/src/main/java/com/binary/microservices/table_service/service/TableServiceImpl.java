package com.binary.microservices.table_service.service;

import com.binary.microservices.table_service.exception.TableNotFoundException;
import com.binary.microservices.table_service.model.Table;
import com.binary.microservices.table_service.repository.TableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TableServiceImpl implements TableService {

    private final TableRepository tableRepository;

    @Override
    public Table getTable(String tableId) {
        return tableRepository.findById(tableId)
                .orElseThrow(() -> new TableNotFoundException("Table not found"));
    }

    @Override
    public Table updateAvailability(String tableId, boolean available) {
        Table table = getTable(tableId);
        table.setAvailable(available);
        return tableRepository.save(table);
    }
}
