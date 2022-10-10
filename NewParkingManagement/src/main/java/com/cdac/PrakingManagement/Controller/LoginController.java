package com.cdac.PrakingManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.PrakingManagement.Services.LoginServce;
import com.cdac.PrakingManagement.entity.Login;

@CrossOrigin(origins = "Http://localhost:3000")
@RestController
public class LoginController {

	@Autowired
	private LoginServce loginServices;
	
	@GetMapping("/allusers")
	public List<Login> getAllUser(){
		return loginServices.getAllUsers();
	}
	
	@PostMapping("/updateuser")
	public Login updateUser(@RequestBody Login l) {
		return loginServices.updateUser(l);
	}
	
	@PostMapping("/logincheck")
	public Object loginCheck(@RequestBody Login l){
		return loginServices.loginCheck(l.getUserName(),l.getPassword());
	}
	
	@GetMapping("/user/{id}")
	public Optional<Login> getUser(@PathVariable int id){
		return loginServices.getUser(id);
	}
	
//	@PostMapping("/changepassword")
//	public boolean forgotPassword(@RequestParam String username,
//			@RequestParam String password) {
//		return loginServices.forgotPassword(username,password);
//	}
	
	

	
	
	
}
