package com.example.onlinelibrarysystem.model;

import exceptions.BookNotAvailableException;

import java.time.LocalDate;

public class PrintedBook extends Book {
    private int pageCount;
    private String bindingType;

    public PrintedBook(String title, String author, String isbn, boolean available, LocalDate publicationDate, int pageCount, String bindingType) {
        super(title, author, isbn, available, publicationDate);
        this.pageCount = pageCount;
        this.bindingType = bindingType;
    }

    // Getters and Setters
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public void borrow() throws BookNotAvailableException {
        super.borrow();
        System.out.println("This printed book has " + pageCount + " pages and " + bindingType + " binding.");
    }

    @Override
    public void returnBook() {
        super.returnBook();
        System.out.println("Printed book returned.");
    }
}

