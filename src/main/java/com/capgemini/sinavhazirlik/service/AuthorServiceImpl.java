package com.capgemini.sinavhazirlik.service;

import com.capgemini.sinavhazirlik.model.Author;
import com.capgemini.sinavhazirlik.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{
    AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> getAllAuthor() {
        Iterable<Author>authors;
        authors=authorRepository.findAll();
        return authors;
    }
}
