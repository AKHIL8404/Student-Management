## 📘Student Management :

The **Student Management System** is a web-based application developed using **Spring Boot** and **Thymeleaf** that enables efficient management of student records in educational institutions. The system allows administrators to perform key operations such as adding, updating, deleting, and searching student data through a user-friendly interface.

This project focuses on maintaining clean data entry by enforcing unique constraints on student email and phone numbers, and it provides real-time feedback for validation errors. Built on the MVC architecture, the application ensures a clear separation of concerns and offers a responsive and organized frontend experience.

---

### ✨ Key Features
## 📌 Features

* 🏠 Homepage
* 📋 List all students
* ➕ Add a new student
* ✏️ Edit student details
* ❌ Delete a student
* 🔍 Search student by ID
* 🛡️ Prevent duplicates for ID, email, and phone
---
### 👨‍💼 Who Is It For?
This project is ideal for:

- Schools, colleges, and training centers needing a basic student record management system

- Academic institutions exploring Spring Boot as a backend framework

- Developers or learners looking for a hands-on introduction to Spring MVC and JPA

### 💡 Use Case

Ideal for academic institutions, coaching centers, or internal administrative tools where basic student data needs to be securely stored and managed without the overhead of large enterprise systems.

---

### 📂 Tech Stack

* **Backend:** Spring Boot (Spring MVC, Spring Data JPA)
* **Frontend:** Thymeleaf Templates (HTML/CSS and Bootstrap)
* **Database:** H2 (default) — can be configured for MySQL
* **Language:** Java 17+
--- 
### 📂 Main Endpoints
| URL                   | Description           |
| --------------------- | --------------------- |
| `/`                   | Homepage              |
| `/students`           | List all students     |
| `/students/new`       | Create new student    |
| `/students/edit/{id}` | Edit existing student |
| `/students/{id}`      | Delete student        |
| `/find?id={id}`       | Search student by ID  |

---

---

## 🚀 Running the Application

### 1. Clone the Repository

```bash
git clone https://github.com/AKHIL8404/Student-Management.git
cd Student-Management
```

### 2. Run the Application

```bash
./mvnw spring-boot:run
```

### 3. Access the Web App

Open your browser and navigate to:

```bash
http://localhost:8080/
```
---

## 👨‍💻 Author
*Akhil Rapelly* 📧 \[[akhilrapelly18@gmail.com](mailto:akhilrapelly18@gmail.com)]
---
# StudentManagementAPI_NG
