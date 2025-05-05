package com.binary.microservices.table_service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TableAvailabilityUpdateRequest {
    @NotNull
    private Boolean available;
}