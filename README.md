# 💳 Spring Boot Transaction Rollback Demo

> A beginner-friendly Spring Boot project demonstrating **Transaction Management** using `@Transactional` and how Spring automatically performs **rollback when an exception occurs**.

---

## 📌 Project Overview

This project simulates a simple **Bank Transaction System** to demonstrate how **Spring Transactions** work in real-world applications.

The core objective is to understand:

* How `@Transactional` works in Spring Boot
* How **database rollback** happens when an exception occurs
* How to structure a Spring Boot backend application properly

Instead of learning only theory, I built this as a **hands-on mini project** inspired by my college practical exam question to strengthen my backend fundamentals.

---

## 🚀 Problem Statement

Imagine transferring money between two bank accounts:

* Money is deducted from **Sender Account**
* Money is added to **Receiver Account**

But what if an error occurs during the process?

Without transaction management:

❌ Money may be deducted but not credited
❌ Database inconsistency may occur

With Spring's `@Transactional`:

✅ Entire transaction succeeds **OR**
✅ Everything gets rolled back automatically

This project demonstrates that rollback behavior.

---

## 🛠️ Tech Stack

| Technology      | Purpose               |
| --------------- | --------------------- |
| Java            | Programming Language  |
| Spring Boot     | Backend Framework     |
| Spring Data JPA | Database Operations   |
| H2 Database     | In-memory Database    |
| Maven           | Dependency Management |

---

## 📂 Project Structure

```plaintext
src
 └── main
      ├── java
      │    └── com.example.banktransaction
      │
      │        ├── entity
      │        │      └── Account.java
      │        │
      │        ├── repository
      │        │      └── AccountRepository.java
      │        │
      │        ├── service
      │        │      └── BankService.java
      │        │
      │        ├── controller
      │        │      └── BankController.java
      │        │
      │        └── config
      │               └── DataLoader.java
      │
      └── resources
             └── application.properties
```

---

## ⚙️ How It Works

### Transaction Flow

1. Fetch sender and receiver accounts
2. Deduct amount from sender account
3. Intentionally trigger an exception
4. Spring detects failure
5. Transaction is rolled back automatically

### Result

The database returns to its original state, maintaining **data consistency**.

---

## 🔥 Key Feature — Transaction Rollback

This project uses:

```java
@Transactional
```

When an exception occurs, Spring automatically:

✔ Cancels incomplete operations
✔ Restores previous database state
✔ Maintains consistency

This concept is widely used in:

* Banking Systems
* Payment Applications
* E-commerce Platforms
* Financial Transactions

---

## 🌐 API Endpoint

### Transfer Money

```http
GET /transfer
```

Example:

```http
http://localhost:8080/transfer
```

---

## ▶️ Run Locally

### Clone Repository

```bash
git clone https://github.com/Jeswin-Madona/springboot-transaction-demo.git
```

### Navigate to Project

```bash
cd springboot-transaction-demo
```

### Run Application

```bash
mvn spring-boot:run
```

Application runs on:

```http
http://localhost:8080
```

---

## 📖 What I Learned

Through this project, I learned:

✅ Spring Boot project structure

✅ Layered architecture
(Entity → Repository → Service → Controller)

✅ Transaction management using `@Transactional`

✅ Exception-based rollback mechanism

✅ Real backend application flow

✅ Git & GitHub project deployment

---

## 🎯 Why I Built This Project

I chose to build this project from my **college practical exam question** because I wanted to turn a small academic task into a real hands-on learning experience.

This is my **first step toward building larger Spring Boot applications**, and it helped me understand how actual backend projects are structured.

---

## 🔮 Future Improvements

* Integrate MySQL Database
* Add proper exception handling
* Add REST API validations
* Build a frontend UI
* Implement real banking logic

---

## 👨‍💻 Author

### Jeswin Madona

**Engineering Student | Learning Java Full Stack Development | Building in Public 🚀**

If you found this project helpful, feel free to ⭐ the repository.
