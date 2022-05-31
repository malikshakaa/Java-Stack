package com.malik.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malik.mvc.models.Baby;
import com.malik.mvc.repositories.BabyRepository;

@Service
public class BabyService {
	
    @Autowired
	private BabyRepository babyRepo;
	 
	public List<Baby> allBabies(){
		return babyRepo.findAll();
		
	}
	
	public Baby create(Baby baby) {
		return babyRepo.save(baby);	
	}
	public Baby updateBabyName(Baby baby) {
		return babyRepo.save(baby);	
	}
	
	public Baby findbyId(Long id) {
		   return babyRepo.findById(id).orElse(null);  
	   }
	   public void deleteBaby(Long id) {
	        
		   babyRepo.deleteById(id);
	    }
}
