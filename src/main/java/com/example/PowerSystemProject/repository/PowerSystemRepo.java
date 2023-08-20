package com.example.PowerSystemProject.repository;

import java.util.List;
import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.PowerSystemProject.model.Battery;


@Repository
public interface PowerSystemRepo extends JpaRepository<Battery,Id>{
	
	
    @Query(value ="select * from Battery where postcode=?1",nativeQuery=true)
	public List<Battery> getBatteryWithPostcodeRange(String postcode);
	
	
	
    @Query(value = "SELECT * FROM Battery WHERE postcode BETWEEN ?1 AND ?2", nativeQuery = true)
   	public List<Battery> getBatteryRange(String postcodemin,String postcodemax);

    
    
}
