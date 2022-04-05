package com.greatlearning.smsapp_demo.service;
import java.util.List;
import com.greatlearning.smsapp_demo.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

}