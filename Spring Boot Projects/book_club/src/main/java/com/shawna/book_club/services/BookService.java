package com.shawna.book_club.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shawna.book_club.models.Book;
import com.shawna.book_club.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private final BookRepository bookRepo;

	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	public Book findOneBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Book editBook(Book book) {
		return bookRepo.save(book);
	}
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}
