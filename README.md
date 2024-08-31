# Online Library Management System (LMS)

## Overview
The Online Library Management System (LMS) is designed to manage books, users, and loans in a library. This project is built with Java and Spring Boot and follows Object-Oriented Programming (OOP) principles, including inheritance, polymorphism, and encapsulation.

## Features
- **Books Management:**
    - `Book`, `EBook`, `PrintedBook` classes to represent different types of books.
    - Sorting, searching, and filtering functionalities using `BookSorter`, `BookSearcher`, and `BookFilter`.

- **User Management:**
    - `User` class with encapsulated properties.
    - `priority` property to manage user priority in borrowing books.

- **Library Operations:**
    - `LibraryQueue` and `LibraryPriorityQueue` for managing users in a queue.
    - `LibraryCollection` to manage a collection of books, with functionalities to borrow and return books.

- **Exception Handling:**
    - Custom exception `BookNotAvailableException` for handling unavailable books.

## Project Structure
```plaintext
src
├── main
│   ├── java
│   │   ├── exceptions
│   │   │   └── BookNotAvailableException.java
│   │   ├── model
│   │   │   ├── Book.java
│   │   │   ├── BookFilter.java
│   │   │   ├── BookSearcher.java
│   │   │   ├── BookSorter.java
│   │   │   ├── Borrowable.java
│   │   │   ├── EBook.java
│   │   │   ├── Library.java
│   │   │   ├── LibraryCollection.java
│   │   │   ├── LibraryPriorityQueue.java
│   │   │   ├── LibraryQueue.java
│   │   │   ├── Loan.java
│   │   │   ├── PrintedBook.java
│   │   │   └── User.java
│   │   └── org.example
│   │       └── Main.java
│   └── resources
├── test
└── target

