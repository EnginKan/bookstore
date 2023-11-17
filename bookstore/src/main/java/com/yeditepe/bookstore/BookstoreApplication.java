package com.yeditepe.bookstore;

import com.yeditepe.bookstore.model.Author;
import com.yeditepe.bookstore.model.Book;
import com.yeditepe.bookstore.model.Customer;
import com.yeditepe.bookstore.repository.AuthorRepository;
import com.yeditepe.bookstore.repository.BookRepository;
import com.yeditepe.bookstore.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{
@Autowired
private CustomerRepository customerRepository;
@Autowired
private BookRepository bookRepository;
@Autowired
private AuthorRepository authorRepository;
	public static void main(String[] args) {

		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public ModelMapper get() {
		return new ModelMapper();
	}


	@Override
	public void run(String... args) throws Exception {
		List<Customer> customers=new ArrayList<>();
						customers.add(new Customer("Engin",
						"Kandiran","kandiran@gmail.com",
						"Atasehir"));
		customers.add(new Customer("Burak",
						"Yilmaz","b.yilmaz@mail.com",
						"Kadikoy"));
		customers.add(new Customer("Berivan",
						"Yilmaz","berivan.yilmaz@mail.com",
						"Kadikoy"));
		customerRepository.saveAll(customers);
		Author author =new Author("Lewis","Loftus");
		authorRepository.save(author);
		Book book1 = new Book("Java Software Solutions","1213243324",new BigDecimal(12.0));
		book1.setAuthor(author);
		book1.setBuyers(customers);
		bookRepository.save(book1);

	}
}



