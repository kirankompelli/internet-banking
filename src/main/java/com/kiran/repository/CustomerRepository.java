package com.kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
