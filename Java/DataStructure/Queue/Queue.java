package com.wipro.queue;

import java.util.NoSuchElementException;

public class Queue {
			int head=0,s=0;
			int queue[]=new int[10];
	
	public void add(int value)
	{
		queue[head++]=value;
		s++;
	}		
	
	public int peek()
	{
		if(!(isEmpty()))
		return queue[head-1];
		
		return 0;
	}
	
	public void show()
	{
		for(int n:queue)
			System.out.print(n+" ");
		System.out.println();
	}
	
	public int remove()
	{	
		int value=queue[--head];
		queue[head--]=0;
		s--;
		return value;
	}
	public int size()
	{
		return s;
	}
	
	public boolean isEmpty()
	{
		boolean res=true;
		if(s!=0)
			res=false;
		return res;
	}
	
	public int element(){
		try{
		if(!(isEmpty()) && head!=0)
			return queue[head-1];
		else
			new NoSuchElementException();
		}
		catch(NoSuchElementException e){
			System.out.println("NosuchElementException");	
		}
		return 0;
	}
	
	

}
