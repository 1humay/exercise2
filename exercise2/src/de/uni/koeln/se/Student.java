package de.uni.koeln.se;
import java.util.ArrayList;


public class Student {
	private String name;
	private int id;
	
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}

}
