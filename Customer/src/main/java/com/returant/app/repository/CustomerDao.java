package com.returant.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.returant.app.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
