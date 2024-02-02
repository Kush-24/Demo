package Java.Project.kush.sda;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String course;
	private int gradeYear;
	private String studId;
	private int tutionBalance;
	private int costOfCourse=600;
	private static int id=1000;
	static Scanner sc=new Scanner(System.in);
	
	public Student(){
		System.out.println("Enter Student firstName: ");
		this.firstName=sc.next();
		System.out.println("Enter Student lastName: ");
		this.lastName=sc.next();
		System.out.println("1.Fresher\n2.Sopmore\n3.Junior\n4.Senior\n Enter your Grade:");
		this.gradeYear=sc.nextInt();
		setStudentId();
		System.out.println("1.History 101\n2.Mathematics 101\n3.English 101\n4.Chemistry 101\n5.Computer Science 101\n"
				+ "Enter Your course");
		this.course=courseEnroll(sc.nextInt());
		statusOfStudent();
		System.out.println(balanceEnq());
				
	}
	//The student should be able to view their balance and pay the tuition
	private String balanceEnq(){
		return "Balance is :"+tutionBalance;
	}
	//To see the status of the student, we should see their name, ID, courses enrolled, and balance
	private void statusOfStudent(){
		System.out.println("Name :"+firstName+" "+lastName+"\nId:"+this.studId+"\nCourse Enrolled:"+getCourse());
	}
	private void setStudentId() {
		id++;
		this.studId=this.gradeYear+""+id;
	}

	private String courseEnroll(int choice) {
		this.tutionBalance=costOfCourse;
		switch (choice) {
		case 1:
			return "History";
		case 2:
		return "Mathmatics";	
		case 3:
		return "English";	
		case 4:
			return "Chemistry";	
		case 5:
		return "Computer Science";
		default :
		return "";	
	}
}
	private String getCourse(){
		return this.course;
	}
}
