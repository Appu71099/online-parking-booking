package com.cdac.PrakingManagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String userName;

	private String password;
	
	private String firstName;
	
	private String lastName;

	private String email;
	
	private String mobileNumber;

	private String gender;
	
//	@JsonIgnoreProperties("user")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="login_id")
	private Login login_id;

	@JsonIgnoreProperties("user_id")
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user_id")
	private BookingSlot bookingSlot;
	
	public User(int userId, String userName, String password, String firstName, String email, String lastName,
			String mobileNumber, String gender, Login login_id) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.email = email;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.login_id = login_id;
	}
	
	public User( String userName, String password, String firstName, String email, String lastName,
			String mobileNumber, String gender, Login login_id) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.email = email;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.login_id = login_id;
	}

	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Login getLogin_id() {
		return login_id;
	}

	public void setLogin_id(Login login_id) {
		this.login_id = login_id;
	}



}
