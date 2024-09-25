package com.returant.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.returant.app.model.Restaurants;
import com.returant.app.repository.RestaurantDao;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantDao restaurantDao;
	
	public List<Restaurants> findAllRestaurant(){
		return restaurantDao.findAll();
	}
	
	public Optional<Restaurants> findRestaurantsById(int id){
		return restaurantDao.findById(id);
	}
	
	public void saveCustomer(Restaurants restaurants) {
		restaurantDao.save(restaurants);
	}

}
