package com.example.demo.ontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Cource;
import com.example.demo.Repository.courceRepositoty;

@RestController
@RequestMapping("/cource")
public class courceController {
	
	
	@Autowired
	private courceRepositoty repository;
	
	@GetMapping("/{id}")
	public Cource getCources(@PathVariable("id") Long id) {
		return repository.findById(id).orElse(null);
	  
	}

}
