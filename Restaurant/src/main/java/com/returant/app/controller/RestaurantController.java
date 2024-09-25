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

import com.returant.app.model.Restaurants;
import com.returant.app.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	
	@PostMapping("/save")
	public Restaurants savdCustomer(@RequestBody Restaurants restaurants)
	{
		restaurantService.saveCustomer(restaurants);
		return restaurants;
	}
	
	@GetMapping("/all")
	public List<Restaurants> getAllCutomer(){
		return restaurantService.findAllRestaurant();
	}
	
	@GetMapping("/{id}")
	public Optional<Restaurants> customerById(@PathVariable int id){
		return restaurantService.findRestaurantsById(id);
	}

}
