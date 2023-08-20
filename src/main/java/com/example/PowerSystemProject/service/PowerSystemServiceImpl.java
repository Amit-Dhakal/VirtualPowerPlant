package com.example.PowerSystemProject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PowerSystemProject.model.Battery;
import com.example.PowerSystemProject.repository.PowerSystemRepo;

@Service
public class PowerSystemServiceImpl implements PowerSystemService {

	@Autowired
	PowerSystemRepo powerSystemRepo;
	
	
	
	@Override
	public String savebatteryInfo(List<Battery> batteries) {
				
			powerSystemRepo.saveAll(batteries);		
		    return "All data are saved";
	}

	
	
	@Override
	public List<Battery> getBatteryRange(String postcodemin, String postcodemax) {
		
		List<Battery> listBattery=powerSystemRepo.getBatteryRange(postcodemin,postcodemax);
		return listBattery;
	}

	
	
	
	
	
	
	/*
	 * @Override public List<Battery> getBatteryWithPostcodeRange(String postcode) {
	 * // TODO Auto-generated method stub
	 * 
	 * List<Battery>
	 * listBattery=powerSystemRepo.getBatteryWithPostcodeRange(postcode);
	 * 
	 * return listBattery;
	 * 
	 * }
	 */

}
