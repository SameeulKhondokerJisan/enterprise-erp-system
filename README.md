# Enterprise ERP Management System

A backend **Enterprise Resource Planning (ERP)** system built using **Spring Boot, Java, MySQL, and Spring Data JPA**.
The system manages core organizational operations such as employees, departments, projects, payroll, and attendance through RESTful APIs.

---

## 🚀 Features

* Employee management through REST endpoints (`POST` and `GET /erp/employees`)
* Service-layer methods to add and list departments, projects, payroll records and attendance (not yet exposed as endpoints)
* JPA entities and MySQL tables for all five modules
* Layered architecture: controller, service, repository, entity

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
git clone https://github.com/SameeulKhondokerJisan/enterprise-erp-system.git
cd enterprise-erp-system/enterprise-erp-system
```

---

### 2️⃣ Configure Database

Create a MySQL database:

```
CREATE DATABASE erp_system;
```

Set your MySQL credentials as environment variables. `application.properties` reads them, so no password is stored in the code:

```
export DB_USERNAME=root
export DB_PASSWORD=your_mysql_password
```

---

### 3️⃣ Run the Application

Run the Spring Boot application (needs Maven installed):

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
