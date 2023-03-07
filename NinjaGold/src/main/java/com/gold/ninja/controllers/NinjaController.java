package com.gold.ninja.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {

	@GetMapping("/")
	public String index(HttpSession session) {
//		session.setAttribute("gold", session);
		return "ninja.jsp";
	}
	
	@PostMapping("/gold") 
	public String gold(@RequestParam(value="farm", required=false) String farm, 
			@RequestParam(value="cave", required=false) String cave, 
			@RequestParam(value="house", required=false) String house, 
			@RequestParam(value="quest", required=false) String quest, 
			HttpSession session ){                                           //starting point 
		ArrayList<String> activities = new ArrayList<String>(); //list of strings that show what's going on
		SimpleDateFormat format = new SimpleDateFormat("MMMM d Y h:mm a");
		Integer gold = 0;
	
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", activities);
		}
		else {
			gold = (Integer) session.getAttribute("gold");
			activities = (ArrayList<String>) session.getAttribute("activities");
			session.setAttribute("activities", activities);
		}
		
		
		if (farm != null) {
			Integer amount = new Random().nextInt(11) + 10;
			gold+= amount;
			session.setAttribute("gold", gold);
			activities.add(0, " <p> You entered a farm and earned " + amount + " gold. (" + format.format(new Date()) + ") </p>");
			return "redirect:/";
		}
		
		if (cave != null) {
			Integer amount = new Random().nextInt(6) + 5;
			gold+= amount;
			session.setAttribute("gold", gold);
			activities.add(0, "<p> You entered a farm and earned " + amount + " gold. (" + format.format(new Date()) + ")</p>");
			return "redirect:/";
		}
		if (house != null) {
			Integer amount = new Random().nextInt(4) + 2;
			gold+= amount;
			session.setAttribute("gold", gold);
			activities.add(0, "<p> You entered a farm and earned " + amount + " gold. (" + format.format(new Date()) + ")</p>");
			return "redirect:/";
		}
		if (quest != null) {
			Integer amount = new Random().nextInt(101) - 50;
			gold+= amount;
			session.setAttribute("gold", gold);
			
			if(amount<0) {
				activities.add(0, " <p style='color: red;'> You failed the quest and lost " + (amount * -1) + " gold. (" + format.format(new Date()) + ") </p>");
			}else {
				activities.add(0, "<p> You completed the quest and earned " + amount + " gold. (" + format.format(new Date()) + ")</p>");
			}
			return "redirect:/";	
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("/clear")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
