package com.example.PowerSystemProject.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.PowerSystemProject.model.Battery;
import com.example.PowerSystemProject.repository.PowerSystemRepo;
import com.example.PowerSystemProject.service.PowerSystemService;
import com.example.PowerSystemProject.service.PowerSystemUtil;

@RestController
@RequestMapping("/api/v1")
public class PowerSystemController {
	
	@Autowired
	PowerSystemService powerSystemService;
	
	@Autowired
	PowerSystemRepo powerSystemRepo;
	
	@Autowired
	PowerSystemUtil powerSystemUtil;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<String> batteryInfo(@RequestBody List<Battery> batteries){
						
		String message=powerSystemService.savebatteryInfo(batteries);		
	    return new ResponseEntity<>(message+":"+batteries, HttpStatus.OK);
		
	}
	
	
	
	
	@RequestMapping(value ="/range/{postcodemin}/{postcodemax}", method = RequestMethod.GET)
	public ResponseEntity<?> batteryRange(@PathVariable String postcodemin,@PathVariable String postcodemax){
			
	   List<Battery> listBattery=powerSystemService.getBatteryRange(postcodemin,postcodemax);	 
       List<Battery> sortedBattery=listBattery.stream().sorted((b1,b2)->b1.getName().compareTo(b2.getName())).collect(Collectors.toList());    	     
       double totalWatt=powerSystemUtil.totalWattCapacity(sortedBattery);  
       double avgWatt=powerSystemUtil.averageWattCapacity(totalWatt,sortedBattery.size());
      	     
	return new ResponseEntity<>(sortedBattery+"Total Watt Capacity :"+totalWatt+ "Average Watt Capacity :"+avgWatt,HttpStatus.OK);		 	
	}



}




/*
 * @RequestMapping(value ="/range/{postcode}", method = RequestMethod.GET)
 * public ResponseEntity<?> batteryPowerRange(@PathVariable String postcode){
 * 
 * List<Battery>
 * listBattery=powerSystemService.getBatteryWithPostcodeRange(postcode);
 * 
 * System.out.println(listBattery);
 * 
 * return new ResponseEntity<>(listBattery,HttpStatus.OK);
 * 
 * 
 * }
 */
 

