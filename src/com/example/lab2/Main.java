package com.example.lab2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Student> al= new ArrayList<Student>();
		System.out.println("Studnet List (ordered by name)");
		Student s1= new Student(101,"Kim",23);
		al.add(s1);
		Student s2= new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Jung",30));
		al.add(new Student(105,"Jang",20));
		al.add(new Student(106,"Lee",45));
		al.add(new Student(107,"Hwang",30));
		al.add(new Student(108,"Hong",27));
		al.add(new Student(109,"Song",50));
		al.add(new Student(110,"Yoo",36));
		
		Collections.sort(al);
		
		for (Student s : al) {
			System.out.println(s.toString());		
		}
	
	}
}
