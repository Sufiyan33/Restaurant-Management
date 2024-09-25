package com.returant.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.returant.app.model.Customer;
import com.returant.app.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public Customer savdCustomer(@RequestBody Customer customer)
	{
		customerService.saveCustomer(customer);
		return customer;
	}
	
	@GetMapping("/all")
	public List<Customer> getAllCutomer(){
		return customerService.findAllCustomer();
	}
	
	@GetMapping("/{id}")
	public Optional<Customer> customerById(@PathVariable int id){
		return customerService.findCustomerById(id);
	}
	
}
