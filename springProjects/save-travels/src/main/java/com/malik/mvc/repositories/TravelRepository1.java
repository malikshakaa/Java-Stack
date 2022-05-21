package com.malik.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malik.mvc.models.TravelModel;

@Repository
public interface TravelRepository1 extends CrudRepository<TravelModel , Long>{

	List<TravelModel> findAll();
	List<TravelModel> findByDescriptionContaining(String search);

}