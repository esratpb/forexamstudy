package com.capgemini.sinavhazirlik;

import com.capgemini.sinavhazirlik.model.Author;
import com.capgemini.sinavhazirlik.model.Book;
import com.capgemini.sinavhazirlik.repository.AuthorRepository;
import com.capgemini.sinavhazirlik.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SinavhazirlikApplication implements CommandLineRunner {
	BookRepository bookRepository;
	AuthorRepository authorRepository;



	public static void main(String[] args) {
		SpringApplication.run(SinavhazirlikApplication.class, args);
	}

	@Autowired
	public SinavhazirlikApplication(BookRepository bookRepository, AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Author author=new Author(1,"Orhanpamuk");
		authorRepository.save(author);

		Author author2=new Author(2,"OrhanDag");
		authorRepository.save(author2);

		bookRepository.save(new Book(1,"Kirmizi",author));
		bookRepository.save(new Book(2,"yesil",author2));

	}


}
