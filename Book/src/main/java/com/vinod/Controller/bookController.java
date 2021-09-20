package com.vinod.Controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.Model.Book;
import com.vinod.Repository.bookRepository;
 

@RestController
@RequestMapping("/book")
public class bookController {

	
	@Autowired
	private bookRepository repository;
	
	@GetMapping("/{id}")
	public Book getBook(@PathVariable("id") Long id) {
		return repository.findById(id).orElse(null);
		
	}
}
