package com.school.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Table(name = "subject")
public class Subject {

	public Subject(long id, Teacher teacher, String name, String semester, String book) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.name = name;
		this.semester = semester;
		this.book = book;
	}

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
	private Teacher teacher;
	
	@Column
	private String name;
	
	@Column
	private String semester;
	
	@Column
	private String book;

	@Override
	public String toString() {
		return "Subject [id=" + id + ", teacher=" + teacher.getName() + ", name=" + name + ", semester=" + semester + ", book="
				+ book + "]";
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public String getTeacher() {
		return teacher.getName();
	}

	public String getName() {
		return name;
	}

	public String getSemester() {
		return semester;
	}

	public String getBook() {
		return book;
	}
	
	
	
}
