package de.uni.koeln.se;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args ) {
		
	Student Humay = new Student(7342256, "Humay Khalilova");
	Professor AndreasVogelsang = new Professor("Prof. Dr. Andreas Vogelsang", 7784);
	Course SoftwareEngineering = new Course(83792, "Software Engineering", 500, AndreasVogelsang );
	//ArrayList<Course> courses = new ArrayList<Course>();
	SoftwareEngineering.enroll(Humay);
	System.out.println(SoftwareEngineering.students);
	}
	
	

}
