package com.example.PowerSystemProject.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.PowerSystemProject.model.Battery;

@SpringBootTest
class PowerSystemRepoTest {

	@Autowired
	private PowerSystemRepo powerSystemRepo;
	
	
	/*
	 * @BeforeEach public void setUp() { MockitoAnnotations.openMocks(this); }
	 * 
	 */	
	
	@Test
	void savebatteryInfo() {
		
	Battery battery=new Battery();
	
	battery.setName("Koolan Island");
	battery.setCapacity(10000);
	battery.setPostcode("6733");
	
	
	Battery battery1=new Battery();

	battery1.setName("Akunda Bay");
	battery1.setCapacity(13500);
	battery1.setPostcode("2084");
	
	
	powerSystemRepo.save(battery);
	powerSystemRepo.save(battery1);
	

	
   org.assertj.core.api.Assertions.assertThat(battery.getId()).isGreaterThan(0);

    }

	  
		
	@Test
	public void getListOfBatteryRange() {
		
		   String postcodemin = "2084";
	       String postcodemax = "5000";
	       
	       Battery battery=new Battery();
	   	
	   	battery.setName("Koolan Island");
	   	battery.setCapacity(10000);
	   	battery.setPostcode("6733");
	   	
	   	
	   	Battery battery1=new Battery();

	   	battery1.setName("Akunda Bay");
	   	battery1.setCapacity(13500);
	   	battery1.setPostcode("2084");
	   	
	   	
	   	powerSystemRepo.save(battery);
	   	powerSystemRepo.save(battery1);
	   	
	   	  
	  List<Battery> listBatteryInfo=powerSystemRepo.getBatteryRange(postcodemin,postcodemax);
	   	  
	      System.out.println(listBatteryInfo);
	      
       org.assertj.core.api.Assertions.assertThat(listBatteryInfo.size()).isGreaterThan(0);
		//assertNotNull(listBatteryInfo.size()>count);
	}
	

}