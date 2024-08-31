package com.example.onlinelibrarysystem.model;

import exceptions.BookNotAvailableException;

import java.time.LocalDate;

public class Book implements Borrowable{
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private LocalDate publicationDate;

    public Book(String title, String author, String isbn, boolean available, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
        this.publicationDate = publicationDate;
    }

    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public void borrow() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException("Book " + title + " is not available for borrowing.");
        }
        available = false;
        System.out.println(title + " has been borrowed.");
    }

    @Override
    public void returnBook() {
        available = true;
        System.out.println(title + " has been returned.");
    }
}

