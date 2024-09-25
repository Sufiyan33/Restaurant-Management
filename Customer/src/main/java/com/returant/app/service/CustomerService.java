package com.returant.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.returant.app.model.Customer;
import com.returant.app.repository.CustomerDao;

@Service
public class CustomerService {
	
	@Autowired(required = true)
	private CustomerDao customerDao;
	
	public List<Customer> findAllCustomer(){
		return customerDao.findAll();
	}
	
	public Optional<Customer> findCustomerById(int id){
		return customerDao.findById(id);
	}
	
	public void saveCustomer(Customer customer) {
		customerDao.save(customer);
	}
	
	
	

}
