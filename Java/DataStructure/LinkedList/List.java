package com.wipro.Linked;

public class List {
	Node head;
	
	public void insert(int value)
	{
		Node node=new Node();
		node.data=value;
		node.next=null;
		
		if(head==null)
			head=node;  //head store the address of first node.
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				 n=n.next;
			}
			 n.next= node;
			 node.next=null; // By default, It's null also .
		}
	}
	
	public void insert(int value,int pos)
	{
		Node n=head;
		Node node=new Node();
		if(pos==0)
		{
			head=node;
			node.next=n;
			node.data=value;
		}
		else
		{
		while(--pos!=0)
			n=n.next;
		
		node.next=n.next;
		node.data=value;
		n.next=node;
		}
	}
	
	public void show()
	{
		Node node= head;
		while(node.next !=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
		}	
		else
		{
			Node n=head,n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;	
			}
			n1=n.next;
			n.next=n1.next;
			n1=null;         // For remove the obj n1.
		}
	}
}
