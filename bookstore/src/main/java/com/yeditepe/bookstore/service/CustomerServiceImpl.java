package com.yeditepe.bookstore.service;

import com.yeditepe.bookstore.model.Customer;
import com.yeditepe.bookstore.repository.CustomerRepository;
import com.yeditepe.bookstore.service.dto.CustomerDTO;
import com.yeditepe.bookstore.service.dto.CustomerMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService{


    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapper modelMapper;
    private final CustomerMapper mapper=new CustomerMapper();

    private CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDTO> getAll() {
        List<Customer> customers=new ArrayList<Customer>();
        customerRepository.findAll().forEach(
                customer->customers.add(customer)
                );
        return
                customers.stream().map(customer->mapper.apply(customer))
                        .collect(Collectors.toList());
            }

    @Override
    public CustomerDTO getCustomerByID(int customer_id) {
        CustomerDTO dto=null;
        Optional<Customer> customer=customerRepository.findById(customer_id);
        if(customer.isPresent())
            dto= modelMapper.map(customer.get(),CustomerDTO.class);
        return dto;


    }

    @Override
    public List<CustomerDTO> getCustomerBySurname(String surname) {
        List<Customer> customers= customerRepository.findBySurname(surname);
        if(customers.size()==0)
        return null;
        else
            return customers.stream().map(c->mapper.apply(c))
                    .collect(Collectors.toList());
    }
}
