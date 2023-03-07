package com.jsokol.househunter.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jsokol.househunter.models.House;

public interface HouseRepository extends CrudRepository<House, Long>{
	List<House> findAll();
	
}
