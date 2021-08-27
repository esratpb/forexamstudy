package com.capgemini.sinavhazirlik.controller;

import com.capgemini.sinavhazirlik.exception.NotFoundException;
import com.capgemini.sinavhazirlik.model.Book;
import com.capgemini.sinavhazirlik.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<Iterable<Book>> getAllBooks(){

        Iterable<Book> books;

        books=bookService.getAllBook();
        return new ResponseEntity<Iterable<Book>>(books, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        Book createdBook=bookService.saveBook(book);
        return new ResponseEntity<>(createdBook,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Optional<Book>bookOptional=this.bookService.findById(book.getId());
        if(bookOptional.isEmpty())
            throw new NotFoundException();

        Book updatedBook;
        updatedBook=bookService.updateBook(book);
        return new ResponseEntity<Book> (updatedBook,HttpStatus.OK);
    }


    @DeleteMapping
    public boolean deleteBook(@RequestBody Integer id){

        Optional<Book>bookOptional=this.bookService.findById(id);
        if(bookOptional.isEmpty())
            throw new NotFoundException();

        bookService.delete(id);
        return true;
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Book> getById(@PathVariable(value = "id")Integer id){

        Optional<Book>bookOptional=this.bookService.findById(id);
        if(bookOptional.isEmpty())
            throw new NotFoundException();

        Book book=bookService.findById(id).get();
        return new ResponseEntity<Book>(book,HttpStatus.OK);
    }


}
