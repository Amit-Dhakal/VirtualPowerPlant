package com.example.PowerSystemProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.PowerSystemProject.model.Battery;

@Service
public interface PowerSystemService {
	
	public String savebatteryInfo(List<Battery> battery);
   	public List<Battery> getBatteryRange(String postcodemin,String postcodemax);

	
//	public List<Battery> getBatteryWithPostcodeRange(String postcode);

}
