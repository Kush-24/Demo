package com.wipro.Linked;

public class PracticeLL {

	public boolean isPalin(String a)
	{
		boolean res=false;
		String b=new StringBuffer(a).reverse().toString();
		if(a.equals(b))
			res=true;
	
		return res;
	}
	
	public String makeString(Node n)
	{
		String a=Integer.toString(n.data);
		while(n.next!=null)
		{    n=n.next;
			a+=Integer.toString(n.data);	
		}
		return a;
	}
	
	public int midIndex(Node n)
	{
		int c=1;
		while(n.next!=null)
		{
			n=n.next;
			c++;
		}
		if(c%2==0)
			c/=2;
		
		return c/2+1;
	}
	
	public int length(Node n){
		int c=1;
		while(n.next!=null)
		{
			n=n.next;
			c++;
		}
		return c;
	}
	
	public int nFromEnd(Node n,int num)
	{
		int len=new PracticeLL().length(n);
		len-=num+1;
		while(len--!=0)
		{
			n=n.next;
		}
		return n.data;
	}

	
}
