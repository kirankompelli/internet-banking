package com.kiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiran.Entity.Customer;
import com.kiran.repository.CustomerRepository;

@Service
public class CustomerImpl  implements CustomerRepoIn{

	@Autowired 
	private CustomerRepository repo;
	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customer.setPin("1234");
		customer.setAccountnumber(1234567898l);
		customer.setUserid("kiran@123");
		repo.save(customer);
		
	}

}
