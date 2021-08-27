package com.capgemini.sinavhazirlik.repository;

import com.capgemini.sinavhazirlik.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
}
