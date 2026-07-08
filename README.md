# 🎓 Student Management System — Java CLI

A robust, console-based **Student Management System** built in core Java, developed as
part of the **DevRise Internship Program — Batch 1 (2026), Task 1 (Java Development)**.

The application allows managers to **Add, View, Update, Delete, and List** student
records entirely in memory, using strong Object-Oriented Design and the Java
Collections framework — no external database dependency.

---

## 📖 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [OOP Design & Architecture](#-oop-design--architecture)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Usage](#-usage)
- [Input Validation Rules](#-input-validation-rules)
- [Testing](#-testing)
- [Future Enhancements](#-future-enhancements)
- [Author](#-author)

---

## 🔍 Overview

This project simulates a real-world CRUD system that a college administrator might use
to manage student profiles from the command line. The focus is on writing **clean,
modular, maintainable code** that follows industry-standard OOP principles rather than
relying on a database or framework.

**Key goals achieved:**
- Zero external dependencies — runs with just the JDK
- No console crashes under invalid input
- Clear separation between data model, business logic, and UI layers

---

## ✨ Features

| # | Feature | Description |
|---|---------|-------------|
| 1 | **Add Student** | Create a new student profile with validated fields |
| 2 | **View Student** | Look up a single student by unique ID |
| 3 | **List Students** | Display all currently stored students |
| 4 | **Update Student** | Edit an existing student's details safely |
| 5 | **Delete Student** | Remove a student record by ID |
| 6 | **Exit** | Clean program termination |

---

## 🛠 Tech Stack

- **Language:** Java (JDK 17+)
- **Data Storage:** In-memory (`HashMap`, `ArrayList`)
- **Paradigm:** Object-Oriented Programming
- **Interface:** Command-Line Interface (CLI)

---

## 🏗 OOP Design & Architecture

| Principle | Implementation |
|---|---|
| **Encapsulation** | All fields in `Person` and `Student` are `private`, exposed only through getters/setters |
| **Inheritance** | `Student` extends the abstract class `Person` |
| **Polymorphism** | `Student` overrides `getDetails()` defined abstractly in `Person` |
| **Abstraction** | `Person` defines a contract that all person-type entities must fulfill |
| **Custom Exceptions** | `StudentNotFoundException`, `InvalidInputException` for domain-specific error handling |
| **Separation of Concerns** | `Main` (UI) → `StudentManager` (business logic) → `Student`/`Person` (data model) |
| **Collections Framework** | `HashMap<Integer, Student>` for O(1) lookups + `ArrayList<Integer>` to preserve insertion order |

This layered architecture mirrors real-world enterprise applications (Controller →
Service → Model), making the codebase easy to extend — for example, swapping the
in-memory store for a JDBC/MySQL-backed DAO later.

---

## 📂 Project Structure

```
StudentManagementSystem/
├── assests/
├── src
│   └── Main.java
├── gitignore
├── LICENSE
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites
- JDK 17 or higher
- Terminal, or any IDE (NetBeans / IntelliJ / VS Code / Eclipse)

### Run from Terminal
```bash
git clone https://github.com/lavanya-m-1004/Student_Management_System.git
cd student-management-system-java/src
javac *.java -d ../out
cd ../out
java Main
```

### Run in NetBeans
1. `File → New Project → Java with Ant/Maven → Java Application`
2. Copy all `.java` files from `src/` into your project's `src` folder
3. Right-click `Main.java` → **Run File**

## 💻 Usage

On launch, the application displays a simple numbered menu:

```
------------ MENU ------------
1. Add Student
2. View Student by ID
3. List All Students
4. Update Student
5. Delete Student
6. Exit
```

### Example: Adding a Student
```
Enter choice: 1
Enter Name: Lavanya M
Enter Age: 21
Enter Course: BSc CS
Enter Email: lavanya@example.com
✔ Student added successfully! Assigned ID: 1
```

### Example: Handling Invalid Input
```
Enter choice: 4
Enter Student ID to update: 99
✖ Error: No student found with ID: 99
```

## 🛡 Input Validation Rules

| Field | Rule |
|---|---|
| Name | Cannot be empty; letters and spaces only |
| Age | Must be between 1 and 100 |
| Course | Cannot be empty |
| Email | Must match valid email format; must be unique |
| Menu choice / ID | Must be a valid integer; non-numeric input is caught gracefully |

## 🧪 Testing

Manually verified for the following scenarios:

- ✅ Adding multiple students with valid data
- ✅ Viewing, updating, and deleting a non-existent ID → handled via `StudentNotFoundException`
- ✅ Entering text where a number was expected → handled via `try-catch`, no crash
- ✅ Adding a duplicate email → rejected with a clear message
- ✅ Full CRUD lifecycle (Add → View → Update → List → Delete) runs error-free

## 🔮 Future Enhancements

- Persist data using JDBC + MySQL
- Add search/filter by name or course
- Convert to a Spring Boot REST API with a web frontend
- Add unit tests using JUnit 5
- Export student list to CSV/Excel

---

## 👤 Author

**Lavanya M**

Built as part of the **DevRise Internship Program — Batch 1 (2026)**, Task 1
(Java Development domain).

📧 Feedback & suggestions welcome via GitHub Issues.

---
