package com.jsokol.househunter.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import com.jsokol.househunter.models.House;
import com.jsokol.househunter.models.User;
import com.jsokol.househunter.services.HouseService;
import com.jsokol.househunter.services.UserService;

@Controller
public class HouseControler {

	@Autowired
	private HouseService serv;

	@Autowired
	private UserService uServ;



	@PostMapping("/create/listing")
	public String pCreateHouse(@Valid @ModelAttribute("newHouse") House newhouse, BindingResult result, Model model,
			HttpSession session) {
		Long whoAmI = (Long) session.getAttribute("userId");
		if(whoAmI ==null) {
			return "redirect:/";
		}
		User currentUser = uServ.getById((long) session.getAttribute("userId"));
		House newHouse = serv.createOrSave(currentUser , newhouse, result);
		model.addAttribute("user", currentUser);
		if (newHouse == null) {
			System.out.println("error");
			return "addlisting.jsp";
		}
		session.setAttribute("houseId", newhouse.getId());
		return "redirect:/dashboard";

	}
	
	@GetMapping("/view/h/{id}")
	public String rViewOneHouse(@PathVariable("id")Long id ,Model model, HttpSession session) {
		Long whoAmI = (Long) session.getAttribute("userId");
		if(whoAmI ==null) {
			return "redirect:/";
		}
		User curUser = uServ.getById((long)session.getAttribute("userId"));
		House oneHouse = serv.findById(id);
		model.addAttribute("user", curUser);
		model.addAttribute("oneHouse", oneHouse);		
		return "viewListing.jsp";
	}
	
	@GetMapping("/edit/h/{id}")
	public String rEditOneHouse(@PathVariable("id")Long id ,Model model, HttpSession session) {
		House oneHouse = serv.findById(id);
		Long whoAmI = (Long) session.getAttribute("userId");
		if(whoAmI == null || whoAmI != oneHouse.getAddedBy() ) {
			return "redirect:/";
		}
		User curUser = uServ.getById((long)session.getAttribute("userId"));
		model.addAttribute("user", curUser);
		model.addAttribute("house", oneHouse);
		return "editListing.jsp";
	}
	
	@PutMapping("/edit/h/{id}")
	public String pEditOneHouse(@Valid @ModelAttribute("house")House house, BindingResult result,
								@PathVariable("id")Long id, Model model, HttpSession session) {
		House oneHouse = serv.findById(id);
		Long whoAmI = (Long) session.getAttribute("userId");
		if(whoAmI == null || whoAmI != oneHouse.getAddedBy() ) {
			return "redirect:/";
		}
		User curUser = uServ.getById((long)session.getAttribute("userId"));
		
		model.addAttribute("user", curUser);
		serv.createOrSave(curUser, house, result);		
		return "redirect:/dashboard";
	}
	
	@GetMapping("/delete/h/{id}")
	public String destroyHouse(@PathVariable("id")Long id, HttpSession session){
		House oneHouse = serv.findById(id);
		Long whoAmI = (Long) session.getAttribute("userId");
		if(whoAmI == null || whoAmI != oneHouse.getAddedBy() ) {
			return "redirect:/";
		}
		serv.delete(id);
		return "redirect:/dashboard";
	}
}
