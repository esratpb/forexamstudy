package com.capgemini.sinavhazirlik.controller;

import com.capgemini.sinavhazirlik.model.Book;
import com.capgemini.sinavhazirlik.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    BookService bookService;
    @GetMapping
    public ResponseEntity<Iterable<Book>> getAllBooks(){

        Iterable<Book> books;

//        books.add(new Book(0,"kirmizi",authorController.getAllAuthor().getBody().get(0)));

        books=bookService.getAllBook();
        return new ResponseEntity<Iterable<Book>>(books, HttpStatus.OK);
    }

}
