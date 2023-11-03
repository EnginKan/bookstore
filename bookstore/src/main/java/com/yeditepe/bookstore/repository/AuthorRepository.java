package com.yeditepe.bookstore.repository;

import com.yeditepe.bookstore.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface AuthorRepository extends CrudRepository<Author,Integer> {

    //public List<Author> getByLast_name(String last_name);
    //public Set<Author> getByBiography(String biography);
}
