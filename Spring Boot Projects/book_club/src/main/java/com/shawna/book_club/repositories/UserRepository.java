package com.shawna.book_club.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shawna.book_club.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	Optional<User> findByEmail(String email);
	
	Optional<User> findUserById(Long id);
	
	Optional<User> findByUserName(String userName);
}
