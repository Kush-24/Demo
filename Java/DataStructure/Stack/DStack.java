package com.wipro.stack;

public class DStack {
			int capacity=2;
			int stack[]=new int[capacity];
			int top=0;
			
			public void push(int data)
			{
				if(size()==capacity)
					expandArray();
			
				  stack[top++]=data; // Push if array full expand and then add.
			}
			
			private void expandArray() {
				int length=size();
				int newStack[]=new int[2*capacity];
				System.arraycopy(stack, 0, newStack, 0, length);
				stack=newStack;
				capacity*=2;
			}
			
			private void shrinkArray() {
				int length=size();
				if(length==capacity/4)
					capacity/=2;
				
				int newStack[]=new int[capacity];
				System.arraycopy(stack, 0, newStack, 0, length);
				stack=newStack;
			}

			public int pop()
			{
				int data=0;
				
				if(!(isEmpty()))
				{
				data=stack[top-1];
				stack[top-1]=0;
				top--;
				shrinkArray();
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


