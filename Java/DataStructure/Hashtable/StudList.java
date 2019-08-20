package com.wipro.hashtable;

public class StudList {
	private Node h;
	public StudList(){
		//dummy Node
		h=new Node();
		h.next=null;
		h.data=null;
	}
	public boolean insertStd(Student std){
		//Node inserted after dummy.
		Node n=new Node();
		n.data=std;
		n.next=h.next; //null
		h.next=n;
		return true;
	}
	
	// For inserting student data, Check it is present or not, with roolNo.
	public boolean haveRollno(String rollNo){
		// first Node reference
		Node temp=h.next; 
		while(temp!=null){
			if(rollNo.equals(temp.data.getRollNo()))
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
// fetch student information,if not present return null.
	public Student fetchData(String rollNo){
		Node temp=h.next; 
		while(temp!=null){
		if(rollNo.equals(temp.data.getRollNo()))
		{
			return temp.data;
		}
		temp=temp.next;
		}
		return null;	
	}
	
	public void deleteStudent(String rollNo){
		Node temp=h.next,prev=h; 
		while(temp !=null){
			if(rollNo.equals(temp.data.getRollNo()))
			{
				prev.next=temp.next;
			}
			prev=temp;
			temp=temp.next;
		}
	}
	
	public void showAll(){
		Node temp=h.next;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	class Node{
		private Student data;
		private Node next;
	}
}
