package com.capgemini.sinavhazirlik.controller;


import com.capgemini.sinavhazirlik.model.Author;
import com.capgemini.sinavhazirlik.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @GetMapping
    public ResponseEntity<Iterable<Author>> getAllAuthor(){
        Iterable<Author> authors;
//        authors.add(new Author(0,"OrhanPamuk"));
        authors=authorService.getAllAuthor();
        return new ResponseEntity<Iterable<Author>>(authors, HttpStatus.OK);

    }
}
