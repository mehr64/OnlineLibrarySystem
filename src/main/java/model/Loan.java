package model;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private User user;
    private LocalDate borrowedAt;
    private LocalDate dueDate;

    public Loan(Book book, User user, LocalDate borrowedAt, LocalDate dueDate) {
        this.book = book;
        this.user = user;
        this.borrowedAt = borrowedAt;
        this.dueDate = dueDate;
    }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public LocalDate getBorrowedAt() { return borrowedAt; }
    public void setBorrowedAt(LocalDate borrowedAt) { this.borrowedAt = borrowedAt; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
}

