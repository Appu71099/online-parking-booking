package com.cdac.PrakingManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.PrakingManagement.entity.Login;
import com.cdac.PrakingManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	@Query("select u from User u where login_id = :id")
	public User getOneByLoginId(Login id);
	
	@Query("select u from User u where user_id = :id")
	public User getOneById(int id);
}
