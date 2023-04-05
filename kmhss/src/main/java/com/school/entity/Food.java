package com.school.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column
	String name;
	
	 @ManyToMany(cascade = {
	            CascadeType.PERSIST,
	            CascadeType.MERGE
	    }, fetch = FetchType.EAGER,
	    mappedBy = "foods")
	    private List<Order> users;

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", users=" + users + "]";
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
}
