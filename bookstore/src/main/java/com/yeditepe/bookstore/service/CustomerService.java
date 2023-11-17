package com.yeditepe.bookstore.service;

import com.yeditepe.bookstore.model.Customer;
import com.yeditepe.bookstore.service.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    public List<CustomerDTO> getAll();

    public CustomerDTO getCustomerByID(int customer_id);

    public List<CustomerDTO> getCustomerBySurname(String surname);


}
