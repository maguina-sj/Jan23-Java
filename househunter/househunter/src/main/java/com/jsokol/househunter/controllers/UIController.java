package com.jsokol.househunter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jsokol.househunter.models.House;
import com.jsokol.househunter.models.LoginUser;
import com.jsokol.househunter.models.User;
import com.jsokol.househunter.services.HouseService;
import com.jsokol.househunter.services.UserService;


@Controller
public class UIController {
	
	@Autowired
	private UserService serv;
	@Autowired
	private HouseService hServ;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newuser", new User());
		model.addAttribute("loguser", new LoginUser());
		return "index.jsp";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	@GetMapping("/dashboard")
	public String browse(Model model, HttpSession session) {
		Long whoAmI = (Long) session.getAttribute("userId");
		if(whoAmI ==null) {
			return "redirect:/";
		}
		User curUser = serv.getById((Long) session.getAttribute("userId"));
		model.addAttribute("user", curUser);
		model.addAttribute("houses", hServ.findAll());
		return "dashboard.jsp";
	}
	
	@GetMapping("/create/listing")
	public String rCreateHouse(Model model, HttpSession session) {
		Long whoAmI = (Long) session.getAttribute("userId");
		if(whoAmI ==null) {
			return "redirect:/";
		}
		model.addAttribute("newHouse", new House());
		model.addAttribute("user", serv.getById((Long) session.getAttribute("userId")));
		return "addlisting.jsp";
	}
}

