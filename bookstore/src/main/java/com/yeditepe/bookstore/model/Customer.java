package com.yeditepe.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import java.util.List;
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;

    private String email;
    private String CreditCardInfo;

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
