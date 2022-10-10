package com.cdac.PrakingManagement.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.PrakingManagement.Repository.LoginRepository;
import com.cdac.PrakingManagement.Repository.UserRepository;
import com.cdac.PrakingManagement.entity.Login;
import com.cdac.PrakingManagement.entity.User;

@Service
public class LoginServce {

	@Autowired
	private LoginRepository loginRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public List<Login> getAllUsers() {
		return loginRepo.findAll();
	}
	
	
	//find user by id
	public Optional<Login> getUser(int id) {
		return loginRepo.findById(id);
	}
	
	//add new user
	public Login saveUser(Login l) {
		try {
		return loginRepo.save(l);
		}catch(Exception e) {
			return null;
		}
	}
	
	//logincheck
	public Object loginCheck(String user_name, String password) {
		
		Login login = loginRepo.logincheck(user_name, password);
		
		//if returns a record
		if(login != null) {
			User p = null;
			
			
			//if record is patient
			if(login.getRole().equals("user")) {
				try {
					p = userRepo.getOneByLoginId(login);

				}catch(Exception e) {
					p=null;
				}
				return p;
			}
			else {
			return null;
			}
		
		}
		return null;
	}
	
	public Login updateUser(Login l) {
		try {
			return loginRepo.save(l);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
////	@Transactional
////	public boolean forgotPassword(String username, String password) {
////		// TODO Auto-generated method stub
////		
////		Login l = loginRepository.checkUsername(username);
////		
////			if(l.getUserName() == null) {
////				return false;
////			}
////			else {
////				loginRepository.updatePassword(username,password);
////				return true;
////			}
//	}
	
	
//	@Transactional
//	public boolean forgotPassword(String username, String password) {
//		Login l = loginRepo.checkUsername(username);
//		
//			if(l.getUserName() == null) {
//				return false;
//			}
//			else {
//				loginRepo.updatePassword(username,password);
//				return true;
//			}
//	}
	
	
}

