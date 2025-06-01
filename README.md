# CRUD Exercise with H2 Database

This is a Spring Boot REST API project that implements a CRUD application managing "Fruita" entities persisted in an **H2 in-memory database**.

---

## Project Setup

- **Dependency Manager:** Maven or Gradle  
- **Language:** Java  
- **Spring Boot Version:** Latest stable version  

### Project Metadata

| Property     | Value                      |
|--------------|----------------------------|
| Group        | `cat.itacademy.s04.t02.n01` |
| Artifact     | `S04T02N01`                 |
| Name         | `S04T02N01`                 |
| Description  | `S04T02N01GognomsNom`       |
| Package Name | `cat.itacademy.s04.t02.n01` |
| Packaging    | Jar                        |
| Java Version | Minimum 11                 |

### Dependencies

- Spring Boot DevTools  
- Spring Web  
- Spring Data JPA  
- H2 Database  

---

## Entity Specification

The entity **Fruita** contains:

| Type   | Property        |
|--------|-----------------|
| int    | `id`            |
| String | `nom`           |
| int    | `quantitatQuilos` |

Persistence is done via JPA into the H2 in-memory database following the MVC pattern.

---

## Package Structure

- `cat.itacademy.s04.t02.n01.controllers`  
- `cat.itacademy.s04.t02.n01.model`  
- `cat.itacademy.s04.t02.n01.services`  
- `cat.itacademy.s04.t02.n01.repository`  
- `cat.itacademy.s04.t02.n01.exception`  

---

## API Endpoints

| HTTP Method | Endpoint                  | Description                      |
|-------------|---------------------------|---------------------------------|
| POST        | `/fruita/add`             | Add a new Fruita                |
| PUT         | `/fruita/update`          | Update an existing Fruita       |
| DELETE      | `/fruita/delete/{id}`     | Delete a Fruita by ID           |
| GET         | `/fruita/getOne/{id}`     | Get a Fruita by ID              |
| GET         | `/fruita/getAll`          | Get all Fruita entries          |

---

## Important Notes

- Follow REST API best practices with correct HTTP status codes and meaningful responses.  
- Use `ResponseEntity` for managing API responses properly.  
- Implement a **GlobalExceptionHandler** for centralized exception handling to improve robustness and consistency in error management.  

---

## Running the Application

- The application runs locally on port **8080** by default.  
- The H2 database runs in-memory and requires no additional setup.  

Run the application via your IDE or with:

```bash
./mvnw spring-boot:run

