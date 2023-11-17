package com.yeditepe.bookstore.service;

import com.yeditepe.bookstore.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAll();

    public Customer getCustomerByID(int customer_id);

    public List<Customer> getCustomerBySurname(String surname);


}
