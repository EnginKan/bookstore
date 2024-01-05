package com.yeditepe.bookstore.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name="Author", description = "Author Entity")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Schema(description="Name of Author", example = "Orhan")
    private String first_name;
    @Schema(description="LastName of Author", example = "Pamuk")
    private String last_name;
    private String biography;
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }



}


