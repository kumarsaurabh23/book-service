package org.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class Controller {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("book1", "author1", 100d));
        books.add(new Book("book2", "author2", 200d));
    }
    @GetMapping("getAllBooks")
    public List<Book> getAllBooks() {
        return books;
    }

    record Book(String name, String author, Double price){};
}
