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

    public CustomerDTO() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
