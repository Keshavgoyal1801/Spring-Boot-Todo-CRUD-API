# 📝 Spring Boot Todo CRUD API

A RESTful Todo List backend application built using Spring Boot. This project demonstrates basic CRUD (Create, Read, Update, Delete) operations for managing todo items.

---

## 🚀 Features

- Create, Read, Update, Delete todos
- REST API built with Spring Boot
- In-memory storage using ArrayList
- Simple and beginner-friendly project
- Tested using Postman

---

## 📂 Project Structure

```
src/
 └── main/
     ├── java/
     │    └── com/example/todo/
     │         ├── controller/
     │         ├── service/
     │         ├── model/
     │         └── TodoApplication.java
     └── resources/
          └── application.properties
```

---

## 📌 API Endpoints

| Method | Endpoint            | Description              |
|--------|---------------------|--------------------------|
| GET    | /api/todo/{id}      | Get todo by ID           |
| POST   | /api/todos          | Create new todo          |
| PUT    | /api/todos/{id}     | Update existing todo     |
| DELETE | /api/todos/{id}     | Delete todo              |

---

## 📦 Todo Schema

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Build a CRUD API",
  "status": true
}
```

---

## 🧪 Testing with Postman

1. Open Postman  
2. Use the endpoints listed above  
3. Set request type (GET, POST, PUT, DELETE)  
4. For POST/PUT, select **Body → raw → JSON**  
5. Send request and verify response  

---

## ⚙️ How to Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/springboot-todo-crud-api.git
   ```

2. Open in your IDE 
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Server will start at:
   ```
   http://localhost:8080
   ```

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Maven

---

## 📈 Future Improvements

- Add database (MySQL / PostgreSQL)
- Add validation
- Add authentication (JWT)
- Add Swagger documentation

---

## 🙌 Author

KESHAV GOYAL

---

⭐ If you like this project, consider giving it a star!
