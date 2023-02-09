package com.lookify.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lookify.models.Song;
import com.lookify.services.SongService;

@Controller
public class MainController{
	@Autowired
	private SongService songService;
	
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/dashboard") 
	public String dashboard(Model model) {
		model.addAttribute("songs", songService.findAll());
;		return "dashboard.jsp";
	}
	@GetMapping("/song/delete/{id}") 
	public String deleteSong(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	@GetMapping("/song/details/{id}") 
	public String viewSong(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", songService.findOne(id));
		return "viewSong.jsp";
	}
	@GetMapping("/song/new")
	public String newSong(@ModelAttribute("newSong") Song song){
		return "newSong.jsp";
	}
	@PostMapping("/song/new")
	public String postSong(@Valid@ModelAttribute ("newSong") Song song, BindingResult result ) {
		if (result.hasErrors()) {
			return "newSong.jsp";
		}
		songService.addOrUpdate(song);
		return "redirect:/dashboard";
	}
	@GetMapping("/songs/top")
	public String topSongs(Model model) {
		model.addAttribute("topSongs", songService.findTopTen());
		return "topSong.jsp";
	}
}
