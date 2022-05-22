package com.malik.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.malik.mvc.models.Dojo;
import com.malik.mvc.models.Ninja;
@Repository
public interface NinjaRepository extends CrudRepository <Ninja, Long> {
	List<Ninja> findAll();
	List<Ninja> findNinjaByDojo(Dojo dojo);

}
