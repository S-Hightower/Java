package com.shawna.omikuji.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	@RequestMapping("/")
	public String base() {
		return "redirect:/omikuji";
	}
	
	@RequestMapping("/omikuji")
	public String main() {
		return "index.jsp";
	}
	
	@PostMapping("/build")
	public String build(HttpSession session,
		@RequestParam(value="number") Integer number,
	    @RequestParam(value="city") String city,
		@RequestParam(value="name") String name,
		@RequestParam(value="job") String job,
		@RequestParam(value="animal") String animal,
		@RequestParam(value="compliment") String compliment) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("job", job);
		session.setAttribute("animal", animal);
		session.setAttribute("compliment", compliment);
		
		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}
	
}
