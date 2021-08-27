package com.capgemini.sinavhazirlik.service;

import com.capgemini.sinavhazirlik.model.Book;
import com.capgemini.sinavhazirlik.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> getAllBook() { return bookRepository.findAll();}

    @Override
    public Book saveBook(Book book) { return bookRepository.save(book); }

    @Override
    public Book updateBook( Book book) { return bookRepository.save(book);
    }

    @Override
    public Optional<Book> findById(int id) {return bookRepository.findById(id); }

    @Override
    public void delete(Integer id) { bookRepository.deleteById(id); }


}
