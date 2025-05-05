package com.binary.microservices.table_service.config;

import com.binary.microservices.table_service.model.Table;
import com.binary.microservices.table_service.repository.TableRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(TableRepository tableRepository) {
        return args -> {
            tableRepository.save(new Table("T001", 4, "Window", true));
            tableRepository.save(new Table("T002", 2, "Corner", false));
            tableRepository.save(new Table("T003", 6, "Center", true));
            tableRepository.save(new Table("T004", 8, "Balcony", false));
        };
    }
}