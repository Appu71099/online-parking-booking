package com.cdac.PrakingManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.PrakingManagement.entity.BookingSlot;

@Repository
public interface BookingSlotRepository extends JpaRepository<BookingSlot,Integer>{

	
	
}
