package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")

public class controller {
	
	//create Some student objects;
		student st1=new student("Nuwan",24, "2020ICT41", "ICT", 3.3);
		student st2=new student("Sandeepa",24, "2020ICT21", "ICT", 4.0);
		student st3=new student("Lasantha",24, "2020ICT73", "ICT", 3.5);
		student st4=new student("Minindu",24, "2020ICT49", "ICT", 3.9);
		
		List<student> students=new ArrayList<student>();
		
		public controller() {
			students.add(st1);
			students.add(st2);
			students.add(st3);
			students.add(st4);
		}
		
		//A method to get a student
		
		@GetMapping("/student")
		public student getStudent() {
			return st1;
		}
		
		//return Multiple Students
		@GetMapping("/students")
		public List<student> getAll() {
			return students;
		}
		
		////Find a Student from the list by regNo
		@GetMapping("/findByID/{id}")
		public student findstu(@PathVariable("id") String reg) {
			for(student stu:students) {
				if(stu.getRegNo().equals(reg)) {
					return stu;
				}
			}
			return null;

			}
		}
