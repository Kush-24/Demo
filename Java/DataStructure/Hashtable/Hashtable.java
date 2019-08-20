package com.kush.hashtable;

public class Hashtable {
	private StudList[] arr;
	private int size;
	private int totalStudents;
	public Hashtable(){
		size=1000;
		arr=new StudList[size];
	}
	public int toHashCode(String rollNo){
		int addascii=0;
		int codeValue=0;
		for(int i=0;i<rollNo.length();i++){
			addascii+=(int)rollNo.charAt(i);	
		}
		codeValue = addascii % arr.length;
		return codeValue;
	}
	
	// insert in array of StudList
	public boolean insert(int key,Student data){
		if(arr[key]==null){
			arr[key]= new StudList(); // dummy list address.
		}
		arr[key].insertStd(data); //arr[key] is StudList object.
		totalStudents++;
		return true;
	}
	
	public int getTotalStudents(){
		return totalStudents;
	}
	
	// Student exist inside array or not .
	public Student fetchStdInfo(String rollNo){
		int key=toHashCode(rollNo);
		if(arr[key]==null)
			return null;
		else	
			return arr[key].fetchData(rollNo);		
	}
	public boolean deleteStd(String rollNo){
		boolean have=arr[toHashCode(rollNo)].haveRollno(rollNo);
		if(have){
			int key=toHashCode(rollNo);
			arr[key].deleteStudent(rollNo);
				totalStudents--;
				return true;
		}
		return false;
	}
	public void showData(){
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=null){
				arr[i].showAll();
			}
			
		}
	}

}
