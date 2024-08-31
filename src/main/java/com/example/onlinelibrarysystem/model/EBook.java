package com.example.onlinelibrarysystem.model;

import exceptions.BookNotAvailableException;

import java.time.LocalDate;

public class EBook extends Book {
    private double fileSize;
    private String format; //  (PDF, EPUB, ...)

    public EBook(String title, String author, String isbn, boolean available, LocalDate publicationDate, double fileSize, String format) {
        super(title, author, isbn, available, publicationDate);
        this.fileSize = fileSize;
        this.format = format;
    }

    // Getters and Setters
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void borrow() throws BookNotAvailableException {
        super.borrow();
        System.out.println("The eBook format is " + format + " and the file size is " + fileSize + " MB.");
    }

    @Override
    public void returnBook() {
        super.returnBook();
        System.out.println("EBook returned.");
    }
}

