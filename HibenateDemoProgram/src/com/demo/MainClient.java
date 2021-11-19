package com.demo;

import java.util.Iterator;

import com.demo.pojo.Student;
import com.demo.service.StudentDaoiml;
import com.mysql.cj.Session;

public class MainClient {

	public static void main(String[] args) {
		
		StudentDaoiml studentDaoiml = new StudentDaoiml();
		Student stude = new Student();
		// insert once record
		stude.setId(101);
		stude.setStudname("Deeksha");
		stude.setAge("23");
		studentDaoiml.createStudent(stude);
		
		System.out.println("  done....");
		
		//to update 
		
		stude.setStudname("Deeksha");
		stude.setAge("24");
		studentDaoiml.updateStudent(stude);
		
		System.out.println("updated");
		
		System.out.println("to get student by id");
	Student stude2=studentDaoiml.getStudent(stude.getId());
	
	System.out.println("to delete");
	studentDaoiml.deleteStudent(stude.getId());
	
	
			
		}
	}

