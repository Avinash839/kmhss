package com.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student_info")
public class StudentInfo {
	
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", mobileNumber=" + mobileNumber + ", address1=" + address1 + ", address2="
				+ address2 + ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="mobile_number")
	private String mobileNumber;
	
	@Column(name ="address_line_1")
	private String address1;
	
	@Column(name ="address_line_2")
	private String address2;
	
	@Column(name ="city")
	private String city;
	
	@Column(name ="country")
	private String country;
	
	@Column(name ="pin_code")
	private String pincode;
}
