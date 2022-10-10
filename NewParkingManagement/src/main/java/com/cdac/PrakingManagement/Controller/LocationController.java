package com.cdac.PrakingManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.PrakingManagement.Services.LocationService;
import com.cdac.PrakingManagement.entity.Location;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LocationController {

	@Autowired 
	private LocationService locationServ;
	
	@GetMapping("/getAllLocation")
	public List<Location> getAllLocations(){
		return locationServ.getAllLocation();
	}
	
	@GetMapping("/getLocation/{locName}")
	public List<Location> searchLocation(@PathVariable String locName) {
		 return locationServ.searchLocation(locName);
	}
	
	@GetMapping("/getLocationById/{id}")
	public Optional<Location> getLocationById(@PathVariable int id) {
		return locationServ.getById(id);
	}
	
	@PostMapping("/saveLocation")
	public Location saveLocation(@RequestBody Location loc) {
		return locationServ.saveLocations(loc);
	}
}
