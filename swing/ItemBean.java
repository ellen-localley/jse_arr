package com.jse.swing;

public class ItemBean {
	private String name;
	private int price;
	private String color;
	
	public ItemBean(String name,int price,String color) {
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
}
