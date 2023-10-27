package com.yeditepe.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String first_name;
    private String last_name;
    private String biography;
    @OneToMany(mappedBy = "author")
    private List<Book> books;



}


