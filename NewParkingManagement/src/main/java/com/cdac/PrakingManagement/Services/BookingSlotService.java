package com.cdac.PrakingManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.PrakingManagement.Repository.BookingSlotRepository;
import com.cdac.PrakingManagement.entity.BookingSlot;
import com.cdac.PrakingManagement.entity.Location;

@Service
public class BookingSlotService {

	@Autowired
	BookingSlotRepository bookingRepo;
	
	public List<BookingSlot> getBooking() {
		return  bookingRepo.findAll();
	}
	
	
//	//search Location
//	public List<BookingSlot> searchLocation(String locName) {
//		return locationRepo.getLocationByName(locName);
//	}
	
	//get by id
	public Optional<BookingSlot> getById(int id) {
		return bookingRepo.findById(id);
	}
	
	public BookingSlot bookSlots(BookingSlot bookLoc) {
		return bookingRepo.save(bookLoc);
	}
	
}
