package com.malik.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.malik.mvc.models.TravelModel;
import com.malik.mvc.repositories.TravelRepo;

@Service
public class TravelService {
	private final TravelRepo travelRepository;
	
	public TravelService(TravelRepo travelRepository) {
		this.travelRepository = travelRepository;
	}
	
	public List<TravelModel> allTravels(){
		return travelRepository.findAll();
	}
	public TravelModel creatTravel (TravelModel b) {
		return travelRepository.save(b);
	}
	public TravelModel findTravel(Long id) {
		Optional<TravelModel> t = travelRepository.findById(id);
		if(t.isPresent()) {
			return t.get();
		}else {
			return null;
		}
	}
	public TravelModel updateTravel (TravelModel t) {
		Optional<TravelModel> t2 = travelRepository.findById(t.getId());
		TravelModel tt=t2.get();
		tt.setDescription(t.getDescription());
		tt.setAmount(t.getAmount());
		tt.setName(t.getName());
		tt.setVendor(t.getVendor());
		return tt;

	}
	public void eleteTravel(Long id) {
		travelRepository.deleteById(id);
	}
}
