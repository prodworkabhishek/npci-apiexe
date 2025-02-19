package com.banking1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class nfiniteUser {
	
	@Id
	private String name;
	private String role;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
