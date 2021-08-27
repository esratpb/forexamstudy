package com.capgemini.sinavhazirlik.service;

import com.capgemini.sinavhazirlik.model.Book;
import com.capgemini.sinavhazirlik.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> getAllBook() {
        Iterable<Book> books;
        books=bookRepository.findAll();
        return books;
    }
}
