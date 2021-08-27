package com.capgemini.sinavhazirlik.service;

import com.capgemini.sinavhazirlik.model.Author;

import java.util.Optional;

public interface AuthorService {
    public Iterable<Author> getAllAuthor();

    public Author save(Author author);

    public Author updatedAuthor(Author author);

   public Optional<Author> getById(Integer id);

    public void delete(Integer id);
}
