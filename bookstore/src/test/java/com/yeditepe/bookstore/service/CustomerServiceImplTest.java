package com.yeditepe.bookstore.service;

import com.yeditepe.bookstore.repository.CustomerRepository;
import com.yeditepe.bookstore.service.dto.CustomerDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
        private CustomerServiceImpl customerService;
        @Autowired
        private CustomerRepository customerRepository;
        @BeforeAll
        public void setup(){
            customerService= new CustomerServiceImpl(customerRepository);
        }
    @Test
    void getAll() {
            List<CustomerDTO> expected=null;
           List<CustomerDTO> actual= customerService.getAll();
           assertEquals(expected,actual);
    }
}