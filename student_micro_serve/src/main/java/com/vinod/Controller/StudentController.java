package com.vinod.Controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vinod.Model.Book;
import com.vinod.Model.Cource;
import com.vinod.Model.Student;
import com.vinod.Repository.*;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	 @Autowired
	 private RestTemplate restTemplate;
	@Autowired
	private studentRepository repository; 
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		 Student std= repository.findById(id).orElse(null);
		
		
		
		 Cource cource = restTemplate.getForObject("http://localhost:8082/cource/" +id, Cource.class);
		 Book book = restTemplate.getForObject("http://localhost:8081/book/"+cource.getId(), Book.class);
		  
		return new Student(std.getName(),cource.getName(),book.getName());

	       
	                   
	                     
	              

	    
	}

}
