package com.jsokol.househunter.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jsokol.househunter.models.LoginUser;
import com.jsokol.househunter.models.User;
import com.jsokol.househunter.services.UserService;

	@Controller
	public class UserController {

		@Autowired
		private UserService serv;
			
		@PostMapping("/create/user")
		public String sUser(@Valid @ModelAttribute("newuser")User user, BindingResult result, 
							Model model, HttpSession session) {
			User newUser = serv.createOrSave(user, result);
			if(newUser==null) {
			model.addAttribute("loguser", new LoginUser());
			return "index.jsp";
			}
			session.setAttribute("userId", newUser.getId());
			return "redirect:/dashboard";

		}
		
		@PostMapping("/login")
		public String lUser(@Valid @ModelAttribute("loguser")LoginUser loguser, BindingResult result, 
							 	Model model, HttpSession session) {
			
			User vUser = serv.login(loguser, result);
			if(vUser == null) {
			model.addAttribute("newuser", new User());
			return "index.jsp";
			}
			session.setAttribute("userId", vUser.getId());
			return "redirect:/dashboard";
		}
}
