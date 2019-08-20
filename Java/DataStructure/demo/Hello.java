package com.wipro.demo;
import java.util.*;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Use of deepToString");
		 int[][] mat = new int[2][2]; 
	        mat[0][0] = 99; 
	        mat[0][1] = 151; 
	        mat[1][0] = 30; 
	        mat[1][1] = 5; 
	  
	        System.out.println(Arrays.deepToString(mat)); 
	        
	         //  deepToString() doesn't work for primitive types 
	        int []  arr2 = {10, 20, 30, 40}; 
	        System.out.println(Arrays.toString(arr2));
	        
	        ArrayList<String> al = new ArrayList<String>(); 
	        al.add("Geeks For Geeks"); 
	        al.add("Friends"); 
	        al.add("Dear"); 
	        al.add("Is"); 
	        al.add("Superb"); 
	  
	        Collections.sort(al); 
	  
	        // Let us print the sorted list 
	        System.out.println("List after the use of" +" Collection.sort() :\n" + al); 
	                           
	}

}
