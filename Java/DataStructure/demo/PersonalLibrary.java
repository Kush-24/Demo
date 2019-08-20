package com.wipro.demo;
import java.util.HashMap;

public class PersonalLibrary {
	
	  public void getFinishedBooks(HashMap<String, Boolean> library)
	  {
	  	if(library.size() <1){
	    	System.out.println("List of books is empty");
	    }
	  	else {
	    	for(String book:library.keySet())
	    	{
	      	if(library.get(book))
	        	System.out.println("Finished-> "+book);  
	        }
	  	}
	  }
	  
	  public void getUnfinishedBooks(HashMap<String, Boolean> library){
	  	if(library.size() <1){
	    	System.out.println("List of books is empty");
	    } else {
	    	for(String book:library.keySet()){
	      	if(!library.get(book)){
	        	System.out.println("Unfinished-> "+book);
	        }
	      }
	    }
	  }
	  
	  public static void main(String[] args){
	    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
	    myBooks.put("Road Down The Funnel", true);
	    myBooks.put("Rat: A Biology", false);
	    myBooks.put("TimeIn", true);
	    myBooks.put("3D Food Printing", false);
	    
	    PersonalLibrary myLibrary = new PersonalLibrary();
	    myLibrary.getFinishedBooks(myBooks);
	    myLibrary.getUnfinishedBooks(myBooks);
	  }

}
