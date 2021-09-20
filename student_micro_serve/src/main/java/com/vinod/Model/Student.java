package com.vinod.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_catalog")
public class Student {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String coource;
	private String book;
public	Student(){
		
	}
	 
	public Student(String name, String coource, String book) {
		super();
		this.name = name;
		this.coource = coource;
		this.book = book;
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
	public String getCoource() {
		return coource;
	}
	public void setCoource(String coource) {
		this.coource = coource;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", coource=" + coource + ", book=" + book + "]";
	}
	
	

}
