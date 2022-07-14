package com.greatlearning.StudentRegistration.service;

import java.util.List;


import com.greatlearning.StudentRegistration.entity.Student;

public interface IStudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);
}
