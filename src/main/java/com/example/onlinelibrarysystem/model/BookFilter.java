package com.example.onlinelibrarysystem.model;

import java.util.List;
import java.util.stream.Collectors;

public class BookFilter {

    public List<Book> filterByAvailability(List<Book> books) {
        return books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());
    }


//    public List<Book> filterByPublicationDateRange(List<Book> books, int startYear, int endYear) {
//        return books.stream()
//                .filter(book -> book.getPublicationDate() >= startYear && book.getPublicationDate() <= endYear)
//                .collect(Collectors.toList());
//    }
    public List<Book> filterByPublicationDateRange(List<Book> books, int startYear, int endYear) {
        return books.stream()
                .filter(book -> {
                    int publicationYear = book.getPublicationDate().getYear();
                    return publicationYear >= startYear && publicationYear <= endYear;
                })
                .collect(Collectors.toList());
    }
}
