package com.cdac.PrakingManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.PrakingManagement.Services.BookingSlotService;
import com.cdac.PrakingManagement.entity.BookingSlot;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookingSlotController {

	@Autowired
	BookingSlotService bookingServ;
	
	@GetMapping("/allbookingSlot")
	public List<BookingSlot> getAllBooking(){
		return bookingServ.getBooking();
	}
	
	@GetMapping("/bookingSlot/{id}")
	public Optional<BookingSlot> getBookingId(@PathVariable int id) {
		return bookingServ.getById(id);
	}
	
	@PostMapping("/saveBookingSlot")
	public BookingSlot saveBooking(@RequestBody BookingSlot bookingSlot) {
		return bookingServ.bookSlots(bookingSlot);
	}
}
