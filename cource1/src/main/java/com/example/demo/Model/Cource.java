package com.example.demo.Model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cource_Table")
public class Cource {
	@Id
	@GeneratedValue
private Long id;
private String name;
public Cource( String name) {
	 
	this.name = name;
}
public Cource() {
	super();
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
