package com.example.onlinelibrarysystem.model;

import exceptions.BookNotAvailableException;
import java.util.*;

public class LibraryCollection {
    private List<Book> bookList;
    private Set<String> bookIds;
    private Map<User, List<Book>> userBookMap;

    public LibraryCollection() {
        this.bookList = new ArrayList<>();
        this.bookIds = new HashSet<>();
        this.userBookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        if (!bookIds.contains(book.getIsbn())) {
            bookList.add(book);
            bookIds.add(book.getIsbn());
        } else {
            System.out.println("Book with ISBN " + book.getIsbn() + " already exists.");
        }
    }
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookList);
    }
    public Book getBookByIsbn(String isbn) {
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    public void borrowBook(User user, String isbn) throws BookNotAvailableException {
        Book book = getBookByIsbn(isbn);
        if (book == null || !book.isAvailable()) {
            throw new BookNotAvailableException("Book is not available or doesn't exist.");
        }

        book.setAvailable(false);
        userBookMap.computeIfAbsent(user, k -> new ArrayList<>()).add(book);
    }
    public List<Book> getBorrowedBooks(User user) {
        return userBookMap.getOrDefault(user, new ArrayList<>());
    }
    public void returnBook(User user, String isbn) {
        List<Book> borrowedBooks = userBookMap.get(user);
        if (borrowedBooks != null) {
            borrowedBooks.removeIf(book -> book.getIsbn().equals(isbn));
            Book returnedBook = getBookByIsbn(isbn);
            if (returnedBook != null) {
                returnedBook.setAvailable(true);
            }
        }
    }





}
