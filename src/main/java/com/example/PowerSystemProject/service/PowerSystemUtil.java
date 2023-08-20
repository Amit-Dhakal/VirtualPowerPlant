package com.example.PowerSystemProject.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.PowerSystemProject.model.Battery;

@Component
public class PowerSystemUtil {
	
	
	
	public double totalWattCapacity(List<Battery> sortedBattery) {
			
		  double sum=0;
		     
		     for(Battery b:sortedBattery) {
		    	 
		     if(b.getCapacity()!=0) {
		    		 
		    sum=sum+b.getCapacity();		 
		    	 }
		    	  
		     }
	// averageWattCapacity(sum,sortedBattery.size());
		     	     
	return sum;
		     
	}
	
	
public double averageWattCapacity(double sum,int size) {
		
		
	return sum/size;
		
	}
	
	
	

}
