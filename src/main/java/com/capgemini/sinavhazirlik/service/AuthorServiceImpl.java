package com.capgemini.sinavhazirlik.service;

import com.capgemini.sinavhazirlik.model.Author;
import com.capgemini.sinavhazirlik.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Author save(Author author) {return authorRepository.save(author);}

    @Override
    public Author updatedAuthor(Author author) {return authorRepository.save(author);}

    @Override
    public Optional<Author> getById(Integer id) {return authorRepository.findById(id)  ;  }

    @Override
    public void delete(Integer id) { authorRepository.deleteById(id);  }
}
