package com.roster.student.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.roster.student.models.Dorm;


public interface DormRepository extends CrudRepository<Dorm, Long> {
	public List<Dorm> findAll();
	


}
