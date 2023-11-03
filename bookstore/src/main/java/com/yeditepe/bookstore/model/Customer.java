package com.yeditepe.bookstore.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

public class Customer {

    private long id;
    private String first_name;
    private String last_name;

    private String email;

    private String address;

    private String phone_number;

    @ManyToMany()
    @JoinTable(
            name="books_bought",
            joinColumns = @JoinColumn(name="customer_id"),
            inverseJoinColumns = @JoinColumn(name="book_id")

    )
    private List<Book> purhased_books;
}
