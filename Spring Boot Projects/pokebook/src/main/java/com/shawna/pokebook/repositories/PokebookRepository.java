package com.shawna.pokebook.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shawna.pokebook.models.Expense;


@Repository
public interface PokebookRepository extends CrudRepository<Expense, Long>{
	List<Expense> findAll();
}
