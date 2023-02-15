package com.roster.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roster.student.models.Dorm;
import com.roster.student.models.Student;
import com.roster.student.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> findAll() {
		return studentRepo.findAll();
	}
	public Student addOrUpdate(Student s) {
		return studentRepo.save(s);
	}
	public Student findOne(Long id) {
		return studentRepo.findById(id).orElse(null);
	}
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}
	public void removeFromDorm(Student student) {
		student.setDorm(null);
		studentRepo.save(student);
	}
	public List<Student> notInThisDorm(Long id){
		return studentRepo.findAllByDormIdNot(id);
	}
	public void updateDorm(Student student, Dorm dorm) {
		student.setDorm(dorm);
		studentRepo.save(student);
	}
	
}
