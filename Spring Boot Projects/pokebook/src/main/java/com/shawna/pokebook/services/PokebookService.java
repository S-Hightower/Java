package com.shawna.pokebook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shawna.pokebook.models.Expense;
import com.shawna.pokebook.repositories.PokebookRepository;

@Service
public class PokebookService {
	
	private final PokebookRepository pokebookRepo;
	
	public PokebookService(PokebookRepository pokebookRepo) {
		this.pokebookRepo =  pokebookRepo;
	}
//find all	
	public List<Expense> allExpenses(){
		return pokebookRepo.findAll();
	}
	
//find one
	public Expense findOneExpense(Long id) {
		Optional<Expense> optionalExpense = pokebookRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}else {
			return null;
		}
	}
	
//create/add
	public Expense addExpense(Expense expense) {
		return pokebookRepo.save(expense);
	}
	
//edit/update
	public Expense editExpense(Expense expense) {
		return pokebookRepo.save(expense);
	}
//delete
	public void deleteExpense(Long id) {
		pokebookRepo.deleteById(id);
	}
}
