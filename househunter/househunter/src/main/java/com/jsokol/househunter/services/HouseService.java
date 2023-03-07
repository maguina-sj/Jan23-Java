package com.jsokol.househunter.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jsokol.househunter.models.House;
import com.jsokol.househunter.models.User;
import com.jsokol.househunter.repositories.HouseRepository;
@Service
public class HouseService {
	@Autowired
	private HouseRepository repo;

	public List<House> findAll() {
		return repo.findAll();
	}

	public House createOrSave(User user, House house, BindingResult result) {
		House newHouse = house;
		User curUser = user; 
		System.out.println(newHouse.getAddress());
		
		if(newHouse.getListed() == null) {
			newHouse.setListed(new Date());
		}
		if (result.hasErrors()) {
			return null;
		}
		curUser.getHouses().add(newHouse);
		repo.save(newHouse);
		
		
		return newHouse; 
	}
	
	public House findById(Long id) {
		Optional<House> oneHouse = repo.findById(id);	
		return oneHouse.get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
		return;
	}
	
}
