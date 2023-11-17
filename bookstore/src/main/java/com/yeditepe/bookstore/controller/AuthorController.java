package com.yeditepe.bookstore.controller;

import com.yeditepe.bookstore.model.Author;
import com.yeditepe.bookstore.repository.AuthorRepository;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("authorapi")
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;
    @GetMapping("/getAuthor/{id}")
    public ResponseEntity<Author> getAuthorByID(@PathVariable(name="id") int id){
        Optional<Author> author=authorRepository.findById(id);
        System.out.println("Author:"+author.get().getId());
        if(author.isPresent()){
            return ResponseEntity.ok(author.get());
        }
        else
            return ResponseEntity.ok(null);

    }
    @PostMapping("/createauthor")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author){
        Author saved = authorRepository.save(author);
        return ResponseEntity.ok(saved);
    }
    @GetMapping("/getAllAuthors")
    public ResponseEntity<List<Author>> getAllAuthors(){
        List<Author> authors = new ArrayList<Author>();
        authorRepository.findAll().forEach(
                author-> authors.add(author)
        );
        return ResponseEntity.ok(authors);
    }
}
