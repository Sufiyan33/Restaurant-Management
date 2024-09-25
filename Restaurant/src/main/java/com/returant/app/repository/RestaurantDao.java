package com.returant.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.returant.app.model.Restaurants;

@Repository
public interface RestaurantDao extends JpaRepository<Restaurants, Integer>{

}
