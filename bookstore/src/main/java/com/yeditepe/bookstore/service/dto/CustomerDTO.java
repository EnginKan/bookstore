package com.yeditepe.bookstore.service.dto;

public class CustomerDTO{
    private String name;
    private String surname;
    private String email;
    private String address;
    private String phone_number;

    public CustomerDTO(String name, String surname, String email, String address, String phone_number) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
    }
}
