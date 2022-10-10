package com.cdac.PrakingManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.PrakingManagement.Repository.LocationRepository;
import com.cdac.PrakingManagement.entity.Location;

@Service
public class LocationService {

	@Autowired
	LocationRepository locationRepo;
	
	public List<Location> getAllLocation() {
		return locationRepo.findAll();
	}
	
	
	//search Location
	public List<Location> searchLocation(String locName) {
		return locationRepo.getLocationByName(locName);
	}
	
	//get by id
	public Optional<Location> getById(int id) {
		return locationRepo.findById(id);
	}
	
	public Location saveLocations(Location l) {
		return locationRepo.save(l);
	}
	
	
}
