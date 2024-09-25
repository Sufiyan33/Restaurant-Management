package com.returant.app.model;

import java.util.Objects;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Restaurants {
	
	@Id
	int id;
	@Nonnull
	String name;
	//Map<String,Integer> menuCards;
	@Nonnull
	String address;
	
	Menu menu;
	
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public Restaurants(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		//this.menuCards = menuCards;
		this.address = address;
	}
	public Restaurants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	public Restaurants(int id, String name, String address, Menu menu) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.menu = menu;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurants other = (Restaurants) obj;
		return Objects.equals(address, other.address) && id == other.id
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Restaurants [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
