package com.shawna.pokebook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.shawna.pokebook.models.Expense;
import com.shawna.pokebook.services.PokebookService;

@Controller
public class PokebookController {
	
	@Autowired
	PokebookService pokebookService;
	
//dashboard: create form & dash
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
        Expense newExpense = new Expense();
        List<Expense> expenses = pokebookService.allExpenses();
		model.addAttribute("expenses", expenses);
		model.addAttribute("newExpense", newExpense);
		return "dashboard.jsp";
	}
	
	@PostMapping("/dashboard")
	public String processDashboard(@Valid @ModelAttribute("newExpense") Expense newExpense,
        BindingResult result, Model model) {
        if(result.hasErrors()) {
            List<Expense> expenses = pokebookService.allExpenses();
            model.addAttribute("expenses", expenses);
            return "dashboard.jsp";
        } else {
            pokebookService.addExpense(newExpense);
            return "redirect:/dashboard";
        }
    }
//find all
//	@GetMapping("/dashboard")
//	public String dashboard(Model model) {
//		List<Expense> expenses = pokebookService.allExpenses();
//		model.addAttribute("expenses", expenses);
//		return "dashboard.jsp";
//	}
//find one
	@GetMapping("/expenses/{id}")
	public String showOneExpense(@PathVariable("id")Long id, Model model) {
		Expense expense = pokebookService.findOneExpense(id);
		model.addAttribute("expense", expense);
		return "showOneExpense.jsp";
	}
//create/add
	@GetMapping("/expenses")
	public String createForm(@ModelAttribute("newExpense")Expense newExpense) {
		
		return "dashboard.jsp";
	}
//process create/add
	@PostMapping("/expenses/add")
	public String processAddForm(@Valid @ModelAttribute("newExpense")Expense newExpense, 
			BindingResult result) {
		if(result.hasErrors()) {
			return "dashboard.jsp";
		}else {
			pokebookService.addExpense(newExpense);
			return "redirect:/dashboard";			
		}
	}
//edit/update
	@GetMapping("/expenses/{id}/edit")
	public String editForm(@PathVariable("id")Long id, Model model) {
		Expense expense = pokebookService.findOneExpense(id);
		model.addAttribute("expense", expense);
		return "editForm.jsp";
	}	
//process edit/update
	@PutMapping("/expenses/{id}/edit")
	public String processEditForm(@Valid @ModelAttribute("expense")Expense expense,
			BindingResult result, @PathVariable("id")Long id) {
		if(result.hasErrors()) {
			return "editForm.jsp";
		}else {
			pokebookService.editExpense(expense);
			return "redirect:/dashboard";
		}
	}
//delete
	@DeleteMapping("/expenses/{id}/delete")
	public String processDeleteExpense(@PathVariable("id")Long id) {
		pokebookService.deleteExpense(id);
		return "redirect:/dashboard";
	}
	
}
