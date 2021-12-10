package com.shawna.dojos_and_ninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shawna.dojos_and_ninjas.models.Dojo;
import com.shawna.dojos_and_ninjas.models.Ninja;
import com.shawna.dojos_and_ninjas.services.DNService;

@Controller
public class DNHomeController {

	@Autowired
	DNService dnService;
//find all ninjas from one dojo	
	@GetMapping("/dojos/{id}")
	public String dashboard(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dnService.findOneDojo(id);
		model.addAttribute("dojo", dojo);
		List<Ninja> ninjas = dnService.allNinjas();
		model.addAttribute("ninjas", ninjas);
		return "locationInfo.jsp";
	}
//create dojo
	@GetMapping("/dojos")
	public String createDojo(@ModelAttribute("newDojo")Dojo newDojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos")
	public String processCreateDojo(@Valid @ModelAttribute("newDojo")Dojo newDojo, 
			BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}else {
			dnService.addDojo(newDojo);
			return "redirect:/ninjas";			
		}
	}
//create ninja
	@GetMapping("/ninjas")
	public String createNinja(@ModelAttribute("newNinja")Ninja newNinja, Model model) {
		List<Dojo> dojos = dnService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas")
	public String processCreateNinja(@Valid @ModelAttribute("newNinja")Ninja newNinja, 
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dnService.allDojos();
			model.addAttribute("dojos", dojos);
			return "newNinja.jsp";
		}else {
			Ninja ninja = dnService.addNinja(newNinja);
			return "redirect:/dojos/"+ninja.getDojo().getId();			
		}
	}
}
