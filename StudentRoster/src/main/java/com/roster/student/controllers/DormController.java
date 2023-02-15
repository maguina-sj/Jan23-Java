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

import com.roster.student.models.Dorm;
import com.roster.student.models.Student;
import com.roster.student.services.DormService;
import com.roster.student.services.StudentService;

@Controller
public class DormController {
	@Autowired
	private DormService dormService;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("dorms", dormService.findAll());
		return "index.jsp";
	}	
	@GetMapping("/dorm/new")
	public String newDorm(@ModelAttribute("newDorm") Dorm dorm) {
		return "newDorm.jsp";
	}
	
	@PostMapping("/dorm/new")
	public String postDorm(@Valid @ModelAttribute("newDorm")Dorm dorm, BindingResult result) {
		if(result.hasErrors()) {
			return "newDorm.jsp";
		}
		dormService.addOrUpdate(dorm);
		return "redirect:/";
	}
	@GetMapping ("dorm/details/{dormId}") 
	public String viewDorm(@PathVariable("dormId") Long id,@ModelAttribute("addStudent") Student student, Model model) {
		
		model.addAttribute("dorm", dormService.findOne(id));
		model.addAttribute("otherStudents", studentService.notInThisDorm(id));
		return "viewDorm.jsp";
	}
	
	@GetMapping("/dorm/destroy/{id}")
	public String destroyDorm(@PathVariable("id") Long id) {
		dormService.deleteDorm(id);
		return "redirect:/";
	}


}
