package com.justin.maps;

public class Student implements Eatable{
	String name;
	int grade;
	Laptop laptop;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	public Student(String name, int grade, Laptop laptop) {
		this.name = name;
		this.grade = grade;
		this.laptop = laptop;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String eat() {
		return "i ate ramen";
	}
	
	public void workOnHomework(){
		System.out.println(laptop.useLaptop());
	}
	
}
