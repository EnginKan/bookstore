package com.yeditepe.bookstore.service.dto;

import com.yeditepe.bookstore.model.Customer;

import java.util.function.Function;

public class CustomerMapper implements Function<Customer,CustomerDTO> {
    @Override
    public CustomerDTO apply(Customer customer) {
        return new CustomerDTO(customer.getName(),
                customer.getSurname(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getPhone_number());
    }
}
