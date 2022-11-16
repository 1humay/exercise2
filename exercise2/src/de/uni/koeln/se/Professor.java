package de.uni.koeln.se;
import java.util.ArrayList;


//import de.uni.koeln.de.Department;
//import de.uni.koeln.de.Employee;

public class Professor extends Employee {
	//public Course course;
	//public void assignTA();
	//public void addCourse();
	public Department department;
	public ArrayList<Course> courses;

	
	public Professor(String name, int id) {
		this.name=name;
		this.employeeId=id;
	}
}

