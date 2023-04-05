package com.school.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tecahers")
public class Teacher {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String name;
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", emailid=" + emailid + ", subjects=" + subjects + "]";
	}


	@Column
	private String emailid;
	
	
	@Column(nullable = true)
	@OneToMany(mappedBy = "teacher", cascade = 
		      CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Subject> subjects;

	public Teacher(long id, String name, String emailid, List<Subject> subjects) {
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.subjects = subjects;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
//	public void addSubjects(Subject subject) {
//		if (subjects == null) {
//			subjects = new ArrayList<>();
//		}
//		subject.setTeacher(this);
//		subjects.add(subject);
//	}
}
