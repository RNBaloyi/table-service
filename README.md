# Table Microservice

The Table Microservice is responsible for managing restaurant table data such as capacity, location, and availability. It provides endpoints to retrieve and update individual tables and is a foundational part of the restaurant reservation system.

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- H2 (in-memory database for testing)
- Maven

---


## Project Structure

com.restaurant.table
├── config # Configuration files (e.g., RestTemplate config for client communication)
├── controller # REST API layer
├── dto # Data Transfer Objects for internal/external communication
├── exception # Custom and global exception handling
├── model # TableEntity definition
├── repository # TableRepository using Spring Data JPA
├── service # Service interface and implementation
└── TableServiceApplication.java

---

##  Getting Started

### 1. Clone the repository

```bash
git clone github.com/RNBaloyi/reservation-service
```

### 2. Run the application

```bash
./mvnw spring-boot:run
```
### 3. H2 Database Access
The app uses an in-memory H2 database that initializes automatically on startup.

H2 Console URL: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:mem:tablesdb

Username: sa

Password: (leave blank)
---

## API Endpoints

### ✅ Get Table by ID

**Request:**

```http
GET /tables/{tableId}
```

**Response:**

```json
{
  "tableId": "T001",
  "capacity": 4,
  "location": "Window",
  "available": true
}
```

---

### 🔄 Update Table Availability

**Request:**

```http
PUT /tables/{tableId}
```

**Body:**

```json
{
  "available": false
}
```

**Response:**

```json
{
  "tableId": "T001",
  "capacity": 4,
  "location": "Window",
  "available": false
}
```

---

## Error Handling

- `404 Not Found` – Table not found
- `500 Internal Server Error` – Unexpected server error

---


