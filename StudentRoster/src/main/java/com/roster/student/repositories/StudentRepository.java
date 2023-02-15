package com.roster.student.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.roster.student.models.Student;


public interface StudentRepository extends CrudRepository<Student, Long> {
	public List<Student> findAll();
	public List<Student> findAllByDormIdNot(Long id);


}
