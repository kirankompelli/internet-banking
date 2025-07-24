package com.kiran.service;

import org.springframework.stereotype.Service;

import com.kiran.Entity.Customer;


public interface CustomerRepoIn {
    public void createCustomer(Customer customer);
}
