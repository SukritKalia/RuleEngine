package com.sukrit.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sukrit.Entity.Student;

@Repository
public class StudentDao {

	public static Map<Integer , Student> students;
	
	static{
		students = new HashMap<Integer , Student>(){
			{
				put(1, new Student( 1, "Said" , "Computer Science"));
				put(2, new Student( 1, "Alex" , "Finance"));
				put(3, new Student( 1, "Anna" , "Maths"));
			}
		};
	}
	
	public Collection<Student> getAllStudents(){
		return StudentDao.students.values();
	}
}
