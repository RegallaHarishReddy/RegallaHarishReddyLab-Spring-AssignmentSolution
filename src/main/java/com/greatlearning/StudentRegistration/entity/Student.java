package com.greatlearning.StudentRegistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@Column // default_column_name = property_name
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 50)
	private String FirstName;
	
	@Column(length = 50)
	private String LastName;

	@Column(length = 50)
	private String Course;

	@Column(length = 50)
	private String country;

	public Student() {

	}

	public Student(String FirstName, String LastName, String Course, String country) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Course = Course;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public String getFirstame() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}

	public String getCourse() {
		return Course;
	}

	public String getCountry() {
		return country;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public void setCourse(String Course) {
		this.Course = Course;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Course=" + Course
				+ ", country=" + country + "]";
	}
	
}
