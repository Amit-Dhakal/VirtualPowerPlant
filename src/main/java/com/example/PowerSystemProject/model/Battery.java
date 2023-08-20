package com.example.PowerSystemProject.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Battery implements Comparable<Battery>{
	
public Battery() {
		
		
	}
	public Battery(String name, String postcode, double capacity) {
		// TODO Auto-generated constructor stub
		
	}

@Id
@GeneratedValue
private Long id;



public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}

private String name;
private String postcode;
private double capacity;





public String getName() {
	return name;
}





public void setName(String name) {
	this.name = name;
}





public String getPostcode() {
	return postcode;
}





public void setPostcode(String postcode) {
	this.postcode = postcode;
}





public double getCapacity() {
	return capacity;
}





public void setCapacity(double capacity) {
	this.capacity = capacity;
}




/*
@Override
public String toString() {
	return "Battery [id=" + id + ", name=" + name + ", postcode=" + postcode + ", capacity=" + capacity + "]";
}

*/





@Override
public int compareTo(Battery o) {
	// TODO Auto-generated method stub
	return 0;
}





@Override
public String toString() {
	return "Battery [name=" + name + ", postcode=" + postcode + ", capacity=" + capacity + "]";
}








}
