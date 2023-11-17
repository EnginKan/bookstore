package com.yeditepe.bookstore.repository;

import com.yeditepe.bookstore.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {

    public List<Customer> findBySurname(String surname);

    //public List<Customer> findByNameFirstTwo(String name);

}
