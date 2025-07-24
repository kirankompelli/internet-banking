package com.kiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.Entity.Customer;
import com.kiran.service.CustomerImpl;

@RestController
public class BankController {
	
	@Autowired
	private CustomerImpl service;
	
	@GetMapping("/home")
	public String getRegister() {
		
		return "index.html";
	}
	
	@PostMapping("/register")
	public String addCustomer(Customer customer) {
		System.out.println("done");
		service.createCustomer(customer);
		System.out.println("after");
		return "redirect:/login.html";
	}
	@GetMapping("/customer")
	public String getCustomer() {
		return "james";
	}
	@PostMapping("/login")
	public void login() {
		System.out.println("login");
	}

}
