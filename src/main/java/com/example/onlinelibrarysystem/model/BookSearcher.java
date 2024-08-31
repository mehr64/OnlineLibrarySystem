
package com.example.onlinelibrarysystem.model;

import java.util.List;
import java.util.stream.Collectors;

public class BookSearcher {


    public List<Book> searchByTitle(List<Book> books, String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }


    public List<Book> searchByAuthor(List<Book> books, String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
}
