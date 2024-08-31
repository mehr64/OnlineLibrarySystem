package org.example;

import model.*;
import exceptions.BookNotAvailableException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryQueue libraryQueue = new LibraryQueue();
        LibraryPriorityQueue libraryPriorityQueue = new LibraryPriorityQueue();

        User user1 = new User("John Doe", "john@example.com", "password");
        user1.setPriority(2);
        User user2 = new User("Jane Smith", "jane@example.com", "password");
        user2.setPriority(1);

        
        libraryQueue.addUserToQueue(user1);
        libraryQueue.addUserToQueue(user2);

        System.out.println("Next user in queue: " + libraryQueue.getNextUser().getName());


        libraryPriorityQueue.addUserToPriorityQueue(user1);
        libraryPriorityQueue.addUserToPriorityQueue(user2);

        System.out.println("Next user in priority queue: " + libraryPriorityQueue.getNextPriorityUser().getName());
    }
//        public static void main(String[] args) {
////            List<Book> books = new ArrayList<>();
////            books.add(new Book("1984", "George Orwell", "123456", true, 1949));
////            books.add(new Book("Brave New World", "Aldous Huxley", "7891011", true, 1932));
////            books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "345678", false, 1925));
//
//            List<Book> books = new ArrayList<>();
//            books.add(new Book("1984", "George Orwell", "123456", true, LocalDate.of(1949, 6, 8)));
//            books.add(new Book("Brave New World", "Aldous Huxley", "7891011", true, LocalDate.of(1932, 9, 1)));
//            books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "345678", false, LocalDate.of(1925, 4, 10)));
//
//
//            BookSorter sorter = new BookSorter();
//            sorter.sortByTitle(books);
//            books.forEach(book -> System.out.println("Sorted by title: " + book.getTitle()));
//
//            BookSearcher searcher = new BookSearcher();
//            List<Book> searchedBooks = searcher.searchByAuthor(books, "George Orwell");
//            searchedBooks.forEach(book -> System.out.println("Searched by author: " + book.getTitle()));
//
//            BookFilter filter = new BookFilter();
//            List<Book> filteredBooks = filter.filterByAvailability(books);
//            filteredBooks.forEach(book -> System.out.println("Filtered by availability: " + book.getTitle()));
//        }
    }

//    public static void main(String[] args) {
//        Library library = new Library();
//        User user = new User("John Doe", "john@example.com", "password");
//
//        Book book1 = new Book("1984", "George Orwell", "123456", true);
//        Book book2 = new Book("Brave New World", "Aldous Huxley", "7891011", true);
//
//        library.addBook(book1);
//        library.addBook(book2);
//
//        try {
//            library.borrowBook(user, book1);
//        } catch (BookNotAvailableException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Books in library: " + library.getBooks().size());
//        System.out.println("Books borrowed by user: " + library.getBorrowedBooks(user).size());
//    }
//}
