# Enterprise ERP Management System

A backend **Enterprise Resource Planning (ERP)** system built using **Spring Boot, Java, MySQL, and Spring Data JPA**.
The system manages core organizational operations such as employees, departments, projects, payroll, and attendance through RESTful APIs.

---

## 🚀 Features

* Employee Management
* Department Management
* Project Management
* Payroll Processing
* Attendance Tracking
* RESTful API Architecture
* MySQL Database Integration

---

## 🛠 Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **MySQL**
* **Maven**
* **REST API**
* **Postman (API Testing)**

---

## 📂 Project Structure

```
src/main/java/com/erp
│
├── controller        # REST API Controllers
├── service           # Business Logic Layer
├── repository        # Data Access Layer
├── entity            # JPA Entity Classes
│
└── EnterpriseErpSystemApplication.java
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the repository

```
git clone https://github.com/yourusername/enterprise-erp-system.git
```

---

### 2️⃣ Configure Database

Create a MySQL database:

```
CREATE DATABASE erp_system;
```

Update **application.properties**

```
spring.datasource.url=jdbc:mysql://localhost:3306/erp_system
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Run the Application

Run the Spring Boot application:

```
mvn spring-boot:run
```

Server will start at:

```
http://localhost:8081
```

---

## 📡 Example API

### Create Employee

```
POST /erp/employees
```

Request Body:

```
{
  "name": "Jisan",
  "email": "jisan@gmail.com",
  "position": "Software Engineer",
  "salary": 50000
}
```

---

### Get All Employees

```
GET /erp/employees
```

---

## 🧪 API Testing

Use **Postman** to test the APIs.

Base URL:

```
http://localhost:8081/erp/
```

---

## 📊 Database Tables

* employee
* department
* project
* attendance
* payroll

---

## 👨‍💻 Author

**Sameeul Khondoker Jisan**

Data Science Student | Software Developer
