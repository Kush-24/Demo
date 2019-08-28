package com.kush.emailproj;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String alternateEmail;
	private String Email;
	private String password;
	private int mailBoxCapacity=10;
	Scanner sc=new Scanner(System.in);
	
	public Email(String firstName,String lastName){
		// this is used to assign local var to class var.
		this.firstName=firstName; 
		this.lastName=lastName;
		
	// Department 
		System.out.println("Hello "+this.firstName+"...!");
		System.out.print("Enter your department No.\n1.Sales \n2.Development \n3.Accounting");
		setDepartment();
	// Email 
		this.Email=getRandomEmail();
		System.out.println("Your Email :"+this.Email);
	//Password 
		System.out.println("Press:\n1.Generate Pass. \n2.Set Pass");
		int passChoice=sc.nextInt();
		if(passChoice==1){
			System.out.println("Enter Password Length");
			int length=sc.nextInt();
		this.password=generatePassword(length);
		System.out.println("Password:"+this.password);
		}
		else if(passChoice==2){
			System.out.println("Enter Your Pass:");
			setPassword(sc.next());
			System.out.println("Password:"+this.password);
		}
		else{
			System.out.println("You entered wrong No");
		}
	}
	
	private String getRandomEmail() {
		String temp=this.firstName+"."+this.lastName+"@"+this.department+".kushcompany.com";
		return temp;
	}

	private void setDepartment(){
		int choice=sc.nextInt();
		if(choice==1)
		department="Sales";
		else if(choice ==2) 
			department="Development";
		else 
			department="Accounting";
	}
	private String generatePassword(int len){
		String pass="ABCDEEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$";
		char password[]=new char[len];
		for(int i=0;i<len;i++){
			int a=(int) (Math.random()*pass.length());
			password[i]=pass.charAt(a);	
		}
		return new String(password);
	}
	public String changePassword(){
		System.out.println("Enter Your old Pass");
		String pass=sc.next();
		if(pass==password){
			System.out.println("Enter New Password");
			password=sc.next();
		}
		return password;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

}
