package com.example.onlinelibrarysystem.service;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    public List<String> getBooks() {


        return Arrays.asList("1984", "Brave New World", "The Great Gatsby");
    }
}

