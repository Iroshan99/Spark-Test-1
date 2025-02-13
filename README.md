# To-Do List Application (Spring Boot + MySQL)

This is a simple To-Do List application built with **Spring Boot** and **MySQL**. It provides a REST API for managing tasks, allowing users to add, mark as completed, delete, and view tasks.

## Features
- Add a task
- Mark a task as completed
- Delete a task
- View all tasks

## Technologies Used
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Maven**

## Prerequisites
Ensure you have the following installed:
- **Java 17+**
- **Maven**
- **MySQL Server**
- **Postman** (or cURL for testing API)

## Setup Instructions
### 1. Clone the Repository
```sh
git clone https://github.com/yourusername/todo-list-springboot.git
cd todo-list-springboot
```

### 2. Configure MySQL Database
Create a database in MySQL:
```sql
CREATE DATABASE todo_db;
```
Update `src/main/resources/application.properties` with your MySQL credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build and Run the Application
```sh
mvn spring-boot:run
```
The application will start at `http://localhost:8080`.

## API Endpoints
### 1. Add a Task
- **Endpoint:** `POST /tasks`
- **Request Body:**
```json
{
  "description": "Buy groceries",
  "completed": false
}
```
- **cURL:**
```sh
curl -X POST http://localhost:8080/tasks -H "Content-Type: application/json" -d '{"description": "Buy groceries", "completed": false}'
```

### 2. View All Tasks
- **Endpoint:** `GET /tasks`
- **cURL:**
```sh
curl -X GET http://localhost:8080/tasks
```

### 3. Mark a Task as Completed
- **Endpoint:** `PUT /tasks/{id}?completed=true`
- **cURL:**
```sh
curl -X PUT "http://localhost:8080/tasks/1?completed=true"
```

### 4. Delete a Task
- **Endpoint:** `DELETE /tasks/{id}`
- **cURL:**
```sh
curl -X DELETE http://localhost:8080/tasks/1
```
Happy Coding! 🚀

