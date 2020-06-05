package com.sapient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	private static Map<Integer,Student> students=new HashMap<>();
	static {
		students.put(101, new Student(101,"Teja",98,'A'));
		students.put(102, new Student(102,"Ajet",70,'C'));
		students.put(103, new Student(103,"Unknown",35,'P'));
		students.put(104, new Student(104,"XAEA-12",30,'F'));
	}
	
	public Student find(int id) {
		return students.get(id);
	}
}
