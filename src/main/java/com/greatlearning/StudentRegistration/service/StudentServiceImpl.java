package com.greatlearning.StudentRegistration.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.greatlearning.StudentRegistration.Repository.StudentRepository;
import com.greatlearning.StudentRegistration.entity.Student;

@Repository
public class StudentServiceImpl implements IStudentService {
	@Autowired
	StudentRepository studentRepository;

	@Transactional
	public List<Student> findAll() {

		List<Student> students = studentRepository.findAll();

		return students;
	}

	@Transactional
	public Student findById(int id) {

		Student student = new Student();

		// find record with Id from the database table
		student = studentRepository.findById(id).get();

		return student;
	}

	@Transactional
	public void save(Student theStudent) {

		studentRepository.save(theStudent);

	}

	@Transactional
	public void deleteById(int id) {

		studentRepository.deleteById(id);

	}
}
