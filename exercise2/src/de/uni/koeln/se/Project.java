package de.uni.koeln.se;

import java.util.ArrayList;

public class Project {
	private String name;
	public ArrayList<Student> members;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void addMemeber(Student student) {
		this.members.add(student);
	}
	
	public ArrayList<Student> getMembers() {
		return this.members;
	}

}
