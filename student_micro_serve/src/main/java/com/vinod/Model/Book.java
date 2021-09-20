package com.vinod.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_table")
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	public Book() {
		
	}

	public Book( String name) {
		 
		 
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
