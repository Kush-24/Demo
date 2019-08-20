package com.wipro.stack;

public class Stack {
	
		int stack[]=new int[5];
		int top=0;
		public void push(int data)
		{
			if(top==5)
				System.out.println("Stack is FUll");
			else
			stack[top++]=data;
		}
		
		public int pop()
		{
			int data=0;
			
			if(!(isEmpty()))
			{
			data=stack[top-1];
			stack[top-1]=0;
			top--;
			}
			else
			{
				System.out.println("Stack is empty");
			}
			return data;
		}
		
		public int peek()
		{
			return stack[top-1];
		}
		
		public void show()
		{
			for(int n:stack)
				System.out.print(n+" ");
			System.out.println();
		}
		
		public boolean isEmpty()
		{
			boolean ans=false;
			if(top==0)
				ans=true;
			
		  return ans;
		}
		public int size()
		{
			return top;
		}

}
