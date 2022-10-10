package com.cdac.PrakingManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.PrakingManagement.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

	@Query("select l from Location l where location_Name= :locationName")
	public List<Location> getLocationByName(String location);
	
}
