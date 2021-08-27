package com.capgemini.sinavhazirlik.repository;

import com.capgemini.sinavhazirlik.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends CrudRepository<Author,Integer> {


}

