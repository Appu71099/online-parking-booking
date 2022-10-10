package com.cdac.PrakingManagement.entity;

public class UserRegestration {

private int userId;
	
	private String userName;

	private String password;
	
	private String firstName;

	private String email;
	
	private String lastName;

	private String mobileNumber;

	private String gender;

	public UserRegestration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegestration(int userId, String userName, String password, String firstName, String email,
			String lastName, String mobileNumber, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.email = email;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
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
	
	
}
