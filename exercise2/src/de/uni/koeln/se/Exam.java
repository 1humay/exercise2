package de.uni.koeln.se;

import java.util.ArrayList;

public class Exam {
	private Course course;
	int maxValue;
	int maxCap = course.maxCapacity;
	public ArrayList<Integer> RegStudents; //arraylist with id numbers of registered students
	
	class Question{
		private String task;
		private int maxValue;
		private int id;
		
		public Question(int id, String task, int maxValue) {
			this.id=id;
			this.task=task;
			this.maxValue=maxValue;
		}
	}
	
	public ArrayList<Question> questions; //arraylist of questions
	
	public ArrayList<Integer> getRegisteredStudents() {
		return this.RegStudents;
	}
	
	public ArrayList<Question> getQuestions() {
		return this.questions;
	}
	
	//registers the given student to the exam
	public void register(Student student) {
		int id=student.getId();
		this.RegStudents.add(id);
	}
	
	
	//is the the given student registered for the exam?
	public boolean registered(Student student) {
		int id=student.getId();
		for (int i = 0; i < this.RegStudents.size(); i++) {
			if (this.RegStudents.get(i)==id) {break;} 
			else {return false;}
		}
		return true;	
	}
	
	public void addQuestion(int id, String task, int value) {
		Question que = new Question(id, task, value);
		this.questions.add(que);
		
	}
	

}
