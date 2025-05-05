package com.binary.microservices.table_service.controller;

import com.binary.microservices.table_service.dto.TableAvailabilityUpdateRequest;
import com.binary.microservices.table_service.model.Table;
import com.binary.microservices.table_service.service.TableService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tables")
@RequiredArgsConstructor
public class TableController {

    private final TableService tableService;

    @GetMapping("/{tableId}")
    public ResponseEntity<Table> getTable(@PathVariable String tableId) {
        return ResponseEntity.ok(tableService.getTable(tableId));
    }

    @PutMapping("/{tableId}")
    public ResponseEntity<Table> updateAvailability(
            @PathVariable String tableId,
            @Valid @RequestBody TableAvailabilityUpdateRequest request) {
        return ResponseEntity.ok(tableService.updateAvailability(tableId, request.getAvailable()));
    }
}