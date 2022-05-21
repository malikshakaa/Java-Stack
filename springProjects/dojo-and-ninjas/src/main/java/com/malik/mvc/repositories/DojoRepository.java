package com.malik.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malik.mvc.models.Dojo;

public interface DojoRepository extends CrudRepository <Dojo, Long> {
	List<Dojo> findAll();

}
