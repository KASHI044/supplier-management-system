# Supplier Management System

## Introduction
A Spring Boot application for managing supplier data.

## Requirements
- Java 17 or later
- Maven 

## Setup and Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/KASHI044/supplier-management-system.git



2. Navigate to the project directory:

cd supplier-management-system

3.Build the project:
./mvnw clean install


Running the Application
./mvnw spring-boot:run

API Endpoints
Supplier Endpoints
Get All Suppliers

curl -X GET http://localhost:8080/api/supplier

Get Supplier by ID
curl -X GET http://localhost:8080/api/supplier/{id}

Create Supplier

curl -X POST http://localhost:8080/api/supplier
-H "Content-Type: application/json"
-d '{"name": "Supplier Name", "address": "Supplier Address"}'

Update Supplier

curl -X PUT http://localhost:8080/api/supplier/{id}
-H "Content-Type: application/json"
-d '{"name": "Updated Name", "address": "Updated Address"}'

Delete Supplier

curl -X DELETE http://localhost:8080/api/supplier/{id}


