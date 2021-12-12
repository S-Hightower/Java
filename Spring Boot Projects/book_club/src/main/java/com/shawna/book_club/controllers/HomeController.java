package com.shawna.book_club.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
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

import com.shawna.book_club.models.Book;
import com.shawna.book_club.models.LoginUser;
import com.shawna.book_club.models.User;
import com.shawna.book_club.services.BookService;
import com.shawna.book_club.services.UserService;

@Controller
public class HomeController {
	 @Autowired
	    private UserService userServ;
	 @Autowired
		private BookService bookServ;
	    
	    @GetMapping("/")
	    public String index(Model model, HttpSession session) {
	    	if (session.getAttribute("user_id") != null) {
				return "redirect:/dashboard";
			}
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "index.jsp";
	    }
	    
	    @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, 
	            BindingResult result, Model model, HttpSession session) {
	        userServ.register(newUser, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newLogin", new LoginUser());
	            return "index.jsp";
	        }
	        session.setAttribute("user_id", newUser.getId());
	        session.setAttribute("userName", newUser.getUserName());
	        return "redirect:/dashboard";
	    }
	    
	    @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        User user = userServ.login(newLogin, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "index.jsp";
	        }else {
	        session.setAttribute("user_id", user.getId());
	        session.setAttribute("userName", user.getUserName());
	        return "redirect:/dashboard";
	        }
	    }
	    
	    @GetMapping("/dashboard")
	    public String homepage(HttpSession session, Model model) {
	    	Long user_id = (Long) session.getAttribute("user_id");
	    	if(session.getAttribute("user_id")== null) {
	    		return "redirect:/";
	    	}else {
	    		User user = userServ.showUser(user_id);
	    		session.getAttribute("user_id");
	    		model.addAttribute("user", user);
	    	}
	    	List<Book> books = bookServ.allBooks();
	    	model.addAttribute("books", books);
	    	return "homepage.jsp";
	    }
	    
	    @GetMapping("/books/new")
		public String addBook(@ModelAttribute("newBook")Book newBook, Model model, HttpSession session) {
	    	if(session.getAttribute("user_id") == null) {
	    		return "redirect:/";
	    	}
			model.addAttribute("user_id", session.getAttribute("user_id"));
			return "newBook.jsp";
		}
		
		@PostMapping("/books/new")
		public String processAddBook(@Valid @ModelAttribute("newBook")Book newBook, 
				BindingResult result, Model model, HttpSession session) {
			if(result.hasErrors()) {
				return "newBook.jsp";
			}else {
				bookServ.addBook(newBook);
				return "redirect:/dashboard";		
			}
		}
		
		@GetMapping("/books/{id}")
		public String showOneBook(@PathVariable("id")Long id, Model model, HttpSession session) {
			Long user_id = (Long) session.getAttribute("user_id");
			if (user_id == null) {
				return "redirect:/";
			} else {
				User user = userServ.showUser(user_id);
				model.addAttribute("user", user);
			}

			model.addAttribute("user_id", user_id);
			
			Book book = bookServ.findOneBook(id);
			model.addAttribute("book", book);
			return "showBook.jsp";
		}
//		@GetMapping("/books/{id}/edit")
//		public String editForm(@PathVariable("id")Long id, Model model, HttpSession session) {
//			Long user_id = (Long) session.getAttribute("user_id");
//			Book book = bookServ.findOneBook(id);
//			
//			if (user_id == null) {
//				return "redirect:/";
//			} else if (user_id.equals(book.getId())) {
//				User user = userServ.showUser(user_id);
//				model.addAttribute("user", user);
//				model.addAttribute("book", book);
//				return "editBook.jsp";
//			} else {
//				return "redirect:/";
//			}
//		}	
//		
//		@PutMapping("/books/{id}/edit")
//		public String processEditForm(@Valid @ModelAttribute("book")Book book,
//				BindingResult result, @PathVariable("id")Long id, HttpSession session) {
//			if(result.hasErrors()) {
//				return "editForm.jsp";
//			}else {
//				bookServ.editBook(book);
//				return "redirect:/dashboard";
//			}
//		}
		
		@DeleteMapping("/books/{id}/delete")
		public String processDeleteBook(@PathVariable("id")Long id) {
			bookServ.deleteBook(id);
			return "redirect:/dashboard";
		}
	    
	    @GetMapping("/logout")
	    public String logout(HttpSession session) {
	    	session.invalidate();
	    	return "redirect:/";
	    	}
}
