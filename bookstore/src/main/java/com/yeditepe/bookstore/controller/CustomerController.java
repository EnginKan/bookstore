package com.yeditepe.bookstore.controller;

import com.yeditepe.bookstore.service.CustomerService;
import com.yeditepe.bookstore.service.dto.CustomerDTO;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customerapi")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("getall")
    public ResponseEntity<List<CustomerDTO>> getAll(){
        List<CustomerDTO> all= customerService.getAll();
        return ResponseEntity.ok(all);

    }
    @GetMapping("getbyid/{id}")
    public ResponseEntity<CustomerDTO> getById(@PathVariable int id){
        CustomerDTO dto=customerService.getCustomerByID(id);
        return ResponseEntity.ok(dto);
    }
}
