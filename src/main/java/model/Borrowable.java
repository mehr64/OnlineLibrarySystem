package model;

import exceptions.BookNotAvailableException;

public interface Borrowable {
    void borrow() throws BookNotAvailableException;
    void returnBook();
}

