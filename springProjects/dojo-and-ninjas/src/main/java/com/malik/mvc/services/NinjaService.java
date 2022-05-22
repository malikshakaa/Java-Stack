package com.malik.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.malik.mvc.models.Dojo;
import com.malik.mvc.models.Ninja;
import com.malik.mvc.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	public NinjaService (NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}

	public List<Ninja>allNinjas(){
		return ninjaRepository.findAll();
	}
	public Ninja creatNinja(Ninja n) {
		return ninjaRepository.save(n);
	}
	
	public List<Ninja>ninjaInDojo(Dojo dojo){
		return ninjaRepository.findNinjaByDojo(dojo);
	}
}
