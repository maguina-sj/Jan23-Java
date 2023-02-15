package com.roster.student.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.roster.student.models.Dorm;
import com.roster.student.models.Student;
import com.roster.student.services.DormService;
import com.roster.student.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private DormService dormService;
	
	@GetMapping("/student/new")
	public String newStudent(@ModelAttribute("newStudent")Student student, Model model) {
		 model.addAttribute("dorms", dormService.findAll());
		return "newStudent.jsp";
	}
	@PostMapping("/student/create")
	public String postStudent(@Valid @ModelAttribute("newStudent") Student student, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dorms", dormService.findAll());
			return "newStudent.jsp";
		}
		model.addAttribute("dorms", dormService.findAll());
		studentService.addOrUpdate(student);
		return "redirect:/";
	}
	@PostMapping("/student/update/{dormId}")
	public String updateStudents (@PathVariable("dormId") Long dormId, Model model, @RequestParam("id")Long id) {
//		if (result.hasErrors()) {
//			model.addAttribute("dorm", dormService.findOne(dormId)); 
//			model.addAttribute("dormStudents", studentService.findAll());
//			model.addAttribute("otherStudents", studentService.notInThisDorm(dormId));
//			return "viewDorm.jsp";
//		}
		Dorm dorm = dormService.findOne(dormId);
		Student student = studentService.findOne(id);
		studentService.updateDorm(student, dorm);


		return "redirect:/dorm/details/{dormId}";
		
	}
	@GetMapping("/student/remove/{id}")
	public String removeStudent(@PathVariable("id") Long id) {
		studentService.removeFromDorm(studentService.findOne(id));
		return "redirect:/";
	}

}
