package model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookSorter {

    // مرتب‌سازی بر اساس عنوان
    public void sortByTitle(List<Book> books) {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    // مرتب‌سازی بر اساس نویسنده
    public void sortByAuthor(List<Book> books) {
        books.sort(Comparator.comparing(Book::getAuthor));
    }

    // مرتب‌سازی بر اساس تاریخ انتشار
    public void sortByPublicationDate(List<Book> books) {
        books.sort(Comparator.comparing(Book::getPublicationDate));
    }
}
