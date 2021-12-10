package com.shawna.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shawna.dojos_and_ninjas.models.Dojo;
import com.shawna.dojos_and_ninjas.models.Ninja;
import com.shawna.dojos_and_ninjas.repositories.DojoRepository;
import com.shawna.dojos_and_ninjas.repositories.NinjaRepository;

@Service
public class DNService {

	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;
	
	public DNService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	
//find all
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
//find one
	public Dojo findOneDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}
//create/add
	public Dojo addDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Ninja addNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
}
