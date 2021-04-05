package com.wolken.wolkenapp.dto;

public class DemoDTO {
	
	private int id;
	private String name;
	private long number;
	
	public DemoDTO() {
		System.out.println("invoking "+this.getClass().getSimpleName());
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

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	
	
}
