package com.cdac.PrakingManagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int locationId;
	private String locationName;
	private String parkingArea;
	private int totalSlots;
	private int availableSlots;
	private int bookedSlots;
	private int bookingPrice;
	private String address;
	
	
	@JsonIgnoreProperties("location_id")
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "location_id")
	private BookingSlot bookingSlot;


	public Location(int locationId, String locationName, String parkingArea, int totalSlots, int availableSlots,
			int bookedSlots, int bookingPrice, String address, BookingSlot bookingSlot) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.parkingArea = parkingArea;
		this.totalSlots = totalSlots;
		this.availableSlots = availableSlots;
		this.bookedSlots = bookedSlots;
		this.bookingPrice = bookingPrice;
		this.address = address;
		this.bookingSlot = bookingSlot;
	}


	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getLocationId() {
		return locationId;
	}


	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}


	public String getLocationName() {
		return locationName;
	}


	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}


	public String getParkingArea() {
		return parkingArea;
	}


	public void setParkingArea(String parkingArea) {
		this.parkingArea = parkingArea;
	}


	public int getTotalSlots() {
		return totalSlots;
	}


	public void setTotalSlots(int totalSlots) {
		this.totalSlots = totalSlots;
	}


	public int getAvailableSlots() {
		return availableSlots;
	}


	public void setAvailableSlots(int availableSlots) {
		this.availableSlots = availableSlots;
	}


	public int getBookedSlots() {
		return bookedSlots;
	}


	public void setBookedSlots(int bookedSlots) {
		this.bookedSlots = bookedSlots;
	}


	public int getBookingPrice() {
		return bookingPrice;
	}


	public void setBookingPrice(int bookingPrice) {
		this.bookingPrice = bookingPrice;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public BookingSlot getBookingSlot() {
		return bookingSlot;
	}


	public void setBookingSlot(BookingSlot bookingSlot) {
		this.bookingSlot = bookingSlot;
	}


	
	
	
	
	
}
