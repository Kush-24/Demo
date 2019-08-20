package com.wipro.demo;
import java.util.HashSet;

//Given an array of integers, find the first repeating element in it. 
//We need to find the element that occurs more than once and whose index of first occurrence is smallest.

public class removeRepeat {
	static void remove(int arr[])
	{
		 HashSet<Integer> set = new HashSet<>(); 
		 int min=-1;
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 if(set.contains(arr[i]))
				 min=i+1;
			 else
				 set.add(arr[i]);
		 }
		 System.out.println(min);
	}
		
	public static void main(String[] args) {
		
		 int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		 //arr[] = {10, 5, 3, 4, 3, 5, 6};
	        remove(arr); 
	}

}
