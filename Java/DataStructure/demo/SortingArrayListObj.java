package com.wipro.demo;

import java.util.*;


 class Student implements Comparable<Student> {
	public Student(int age, String name, double marks) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	int age;
	String name;
	 double marks;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String toString(){
		return "Age :"+getAge()+" Name:"+getName()+" Marks:"+getMarks();
		
	}
	@Override
	public int compareTo(Student o) {
		if(this.age>o.age)
		return 1;
		else
		return -1;
	}
}


public class SortingArrayListObj {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>(); 
		list.add(new Student(70, "Kushagra", 98));
		list.add(new Student(20, "Sumit", 60));
		list.add(new Student(30, "Ram", 90));
		Collections.sort(list);
		for(Student n:list)
			System.out.println(n);
	}
}
