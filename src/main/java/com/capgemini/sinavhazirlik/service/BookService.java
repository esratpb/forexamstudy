package com.capgemini.sinavhazirlik.service;

import com.capgemini.sinavhazirlik.model.Book;

import java.util.Optional;

public interface BookService {

    public Iterable<Book> getAllBook();

    public Book saveBook(Book book);

    public Book updateBook(Book book);

    public Optional<Book> findById(int id);

    public void delete(Integer id);
}
