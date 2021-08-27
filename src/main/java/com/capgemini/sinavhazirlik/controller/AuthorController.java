package com.capgemini.sinavhazirlik.controller;


import com.capgemini.sinavhazirlik.exception.NotFoundException;
import com.capgemini.sinavhazirlik.model.Author;
import com.capgemini.sinavhazirlik.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping
    public ResponseEntity<Iterable<Author>> getAllAuthor(){
        Iterable<Author> authors;
        authors=authorService.getAllAuthor();
        return new ResponseEntity<Iterable<Author>>(authors, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author){
        Author createdAuthor= authorService.save(author);
        return new ResponseEntity<Author>(createdAuthor,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Author> updatedAuthor(@RequestBody Author author){
        Optional<Author> optionalAuthor=authorService.getById(author.getId());
        if(optionalAuthor.isEmpty())
            throw new NotFoundException();

        Author updatedAuthor=authorService.updatedAuthor(author);
        return new ResponseEntity<Author>(updatedAuthor,HttpStatus.OK);
    }

    @DeleteMapping
    public boolean deleteAuthor(@RequestBody Integer id){
        Optional<Author> optionalAuthor=authorService.getById(id);
        if(optionalAuthor.isEmpty())
            throw new NotFoundException();
        authorService.delete(id);
        return true;
    }
}
