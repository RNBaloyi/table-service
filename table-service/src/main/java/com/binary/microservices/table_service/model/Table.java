package com.binary.microservices.table_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@jakarta.persistence.Table(name = "restaurant_table")
public class Table {
    @Id
    private String tableId;
    private int capacity;
    private String location;
    private boolean available;
}