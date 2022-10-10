package com.cdac.PrakingManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.PrakingManagement.Repository.UserRepository;
import com.cdac.PrakingManagement.entity.User;
import com.cdac.PrakingManagement.entity.UserRegestration;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	//fetch patient by it's id
	public Optional<User> getOneUser(int id) {
		return userRepo.findById(id);
	}

	//add new patient
	public User saveUser(User u) {
		
		try {
			return userRepo.save(u);
		} catch (Exception e) {
			return null;
		}
	}
	
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		try {
			return userRepo.save(u);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public Optional<User> getOneUserById(int id) {
		return userRepo.findById(id);
	}
	
}
