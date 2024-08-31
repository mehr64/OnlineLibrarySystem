package com.example.onlinelibrarysystem.model;

import exceptions.BookNotAvailableException;
import java.util.*;

public class Library {
    private List<Book> books;
    private Set<String> uniqueBookIds;
    private Map<User, List<Book>> userBorrowedBooks;
    public Library() {
        this.books = new ArrayList<>();
        this.uniqueBookIds = new HashSet<>();
        this.userBorrowedBooks = new HashMap<>();
    }


    public void addBook(Book book) {
        books.add(book);
        uniqueBookIds.add(book.getIsbn());
    }

    public void borrowBook(User user, Book book) throws BookNotAvailableException {
        if (!book.isAvailable()) {
            throw new BookNotAvailableException("Book " + book.getTitle() + " is not available");
        }

        book.setAvailable(false);


        userBorrowedBooks.computeIfAbsent(user, k -> new ArrayList<>()).add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getBorrowedBooks(User user) {
        return userBorrowedBooks.getOrDefault(user, new ArrayList<>());
    }

    public boolean isBookIdUnique(String bookId) {
        return uniqueBookIds.contains(bookId);
    }
}

