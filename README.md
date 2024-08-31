# Online Library Management System (LMS)

## Overview
The Online Library Management System (LMS) is designed to manage books, users, and loans within a library. This project is built using Java and Spring Boot, and it adheres to Object-Oriented Programming (OOP) principles such as inheritance, polymorphism, and encapsulation.

## Technologies Used
- **Java 21**: Core programming language.
- **Spring Boot 3.3.2**: Framework for building the RESTful web services.
- **Maven**: Dependency management and build automation tool.
- **JUnit**: Testing framework for unit tests.
- **H2 Database**: In-memory database for development and testing.
- **Lombok**: Library for reducing boilerplate code in Java.

## Features
- **Books Management:**
  - Classes like `Book`, `EBook`, and `PrintedBook` to represent different types of books.
  - Sorting, searching, and filtering functionalities using `BookSorter`, `BookSearcher`, and `BookFilter`.

- **User Management:**
  - `User` class with encapsulated properties.
  - `priority` property to manage user priority in borrowing books.

- **Library Operations:**
  - `LibraryQueue` and `LibraryPriorityQueue` for managing user queues.
  - `LibraryCollection` to manage a collection of books, with functionalities to borrow and return books.

- **Exception Handling:**
  - Custom exception `BookNotAvailableException` for handling scenarios where a requested book is unavailable.

- **RESTful API**:
  - API endpoints to manage books within the library.

## Project Structure
```plaintext
OnlineLibrarySystem
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.onlinelibrarysystem
│   │   │   │   ├── component
│   │   │   │   │   └── MyComponent.java
│   │   │   │   ├── controller
│   │   │   │   │   └── BookController.java
│   │   │   │   ├── model
│   │   │   │   │   ├── Book.java
│   │   │   │   │   ├── BookFilter.java
│   │   │   │   │   ├── BookSearcher.java
│   │   │   │   │   ├── BookSorter.java
│   │   │   │   │   ├── Borrowable.java
│   │   │   │   │   ├── EBook.java
│   │   │   │   │   ├── Library.java
│   │   │   │   │   ├── LibraryCollection.java
│   │   │   │   │   ├── LibraryPriorityQueue.java
│   │   │   │   │   ├── LibraryQueue.java
│   │   │   │   │   ├── Loan.java
│   │   │   │   │   ├── PrintedBook.java
│   │   │   │   │   └── User.java
│   │   │   │   ├── repository
│   │   │   │   │   └── BookRepository.java
│   │   │   │   ├── service
│   │   │   │   │   └── BookService.java
│   │   │   │   └── OnlineLibrarySystemApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com.example.onlinelibrarysystem
│               └── BookControllerTest.java
├── pom.xml
└── README.md
