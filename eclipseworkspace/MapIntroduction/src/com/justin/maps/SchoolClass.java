package com.justin.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SchoolClass {
	private Map<String, Student> students;
	private List<Student> studentsList;
	private Student[] studentsArray;
	private List<Eatable> eatables;
	
	public SchoolClass(){
		eatables = new ArrayList();
		eatables.add(new Student("Jerry", 1));
		eatables.add(new Animal("j man", "brown"));
		
		studentsArray = new Student[4];
		studentsArray[0] = new Student("james", 1, new AdellLaptop());
		studentsArray[1] = new Student("james", 1, new AdellLaptop());
		studentsArray[2] = new Student("james", 1, new HPLaptop());
		studentsArray[3] = new Student("james", 1, new HPLaptop());
		
		students = new HashMap<>();
		students.put("james", new Student("james", 1));
		students.put("kelly", new Student("james", 1));
		students.put("adam", new Student("james", 1));
		
		studentsList = new ArrayList();
		studentsList.add(new Student("james", 1));
		studentsList.add(new Student("james2", 2));
		studentsList.add(new Student("james3", 3));
		studentsList.add(new Student("james4", 4));
	}
	public Student reportStudent(String studentName){
		return students.get(studentName);
	}
	
	public String reportClass(){
		for(int i = 0; i < studentsList.size(); i++){
			System.out.println(studentsList.get(i).getName());
		}
		
		for (Student currentStudent : studentsList) {
			System.out.println(currentStudent.getName());
		}
		
		for (Student currentStudent : studentsArray) {
			System.out.println(currentStudent.getName());
		}
		
		for (Entry<String, Student> currentStudent : students.entrySet()) {
			System.out.println(currentStudent.getValue().getName());
		}
		
		return null;
	}
	public void reportLaptopUse(){
		for (Student currentStudent : studentsArray) {
			System.out.println("my name is " + currentStudent.getName() + " ");
			currentStudent.workOnHomework();
		}
	}
	public String reportEatables(){
		for (Eatable eatable : eatables) {
			System.out.println(eatable.eat());
		}
		return null;
	}
	
	
}
