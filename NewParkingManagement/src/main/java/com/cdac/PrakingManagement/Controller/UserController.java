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

import com.cdac.PrakingManagement.Services.LoginServce;
import com.cdac.PrakingManagement.Services.UserService;
import com.cdac.PrakingManagement.entity.Login;
import com.cdac.PrakingManagement.entity.User;
import com.cdac.PrakingManagement.entity.UserRegestration;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	LoginServce loginService;
	
	@GetMapping("/getUser")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/getoneUser/{id}")
	public Optional<User> getOneUser(@PathVariable int id) {
		return userService.getOneUser(id);
	}
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User u) {
			Login l = new Login(u.getUserName(),u.getPassword(),"user");
			Login inserted = loginService.saveUser(l);
			if(inserted == null) {
				return null;
			}
			else {
				User u1 = new User(u.getUserName(),u.getPassword(),u.getFirstName(),u.getEmail(),u.getLastName(),u.getMobileNumber(),u.getGender(), inserted);
				return userService.saveUser(u1);
			}
	}
	
	
//	@PostMapping("/updateUser")
//	public User updateUser(@RequestBody User u , int id) {
//		return userService.updateUser(u);
//	}
}
