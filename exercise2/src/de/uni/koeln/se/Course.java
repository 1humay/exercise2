package de.uni.koeln.se;
import java.util.ArrayList;

//import de.uni.koeln.de.Professor;

public class Course {
	private int id;
	private String name;
	public int maxCapacity;
	private boolean isFull;
	public Professor professor;
	public ArrayList<Student> students;
	
	public Course(int id, String name, int cap, Professor professor) {
		this.id=id;
		this.name=name;
		this.maxCapacity=cap;
		this.professor=professor;
		professor.courses.add(this);
	}
	
	//methods
	
	public void enroll(Student student) {
		if ( this.students.size() < this.maxCapacity ) {
			this.students.add(student);
		}
		else {
			System.out.println("This course is already full.");
			}
	}
	
	public Professor getProf() {
		return this.professor;
	}
	
	public void setMaxCap(int max) {
		this.maxCapacity=max;
	}
	
	public void setName(String name) {
		this.name=name;
	}

}
