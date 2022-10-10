package com.cdac.PrakingManagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class BookingSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	private String vehicleName;
	private String vehicleNumber;
	private String vehicleType;
	private String parkingTime;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="location_id")
	private Location location_id;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user_id;



	public BookingSlot(int bookingId, String vehicleName, String vehicleNumber, String vehicleType, String parkingTime,
			Location location_id, User user_id) {
		super();
		this.bookingId = bookingId;
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.parkingTime = parkingTime;
		this.location_id = location_id;
		this.user_id = user_id;
	}


	public BookingSlot() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public String getVehicleName() {
		return vehicleName;
	}


	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}


	public String getVehicleNumber() {
		return vehicleNumber;
	}


	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getParkingTime() {
		return parkingTime;
	}


	public void setParkingTime(String parkingTime) {
		this.parkingTime = parkingTime;
	}


	public Location getLocation_id() {
		return location_id;
	}


	public void setLocation_id(Location location_id) {
		this.location_id = location_id;
	}


	public User getUser_id() {
		return user_id;
	}


	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	
	

	
	
	
	
}
