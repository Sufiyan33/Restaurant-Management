package com.returant.app.model;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Menu {
	
	String dishName;
	int price;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String dishName, int price) {
		super();
		this.dishName = dishName;
		this.price = price;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dishName, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return Objects.equals(dishName, other.dishName) && price == other.price;
	}
	@Override
	public String toString() {
		return "Menu [dishName=" + dishName + ", price=" + price + "]";
	}
	
	

}
