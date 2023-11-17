package com.yeditepe.bookstore.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "book_table")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="book_title",nullable = false)
    private String title;
    private String isbn;
    private LocalDate published_date;

    private BigDecimal price;
    private int quantity_in_stock;

    public Book(String title, String isbn, BigDecimal price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    @ManyToOne
    @JoinTable(name="author_book")
    private Author author;

    @ManyToMany()
    private List<Customer> buyers;



}
