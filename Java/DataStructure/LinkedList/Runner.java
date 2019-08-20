package com.wipro.Linked;
public class Runner {
	public static void main(String[] args) {
		
		List list=new List();
		PracticeLL pc=new PracticeLL();
		list.insert(1);
		list.insert(0);
		list.insert(0);
		list.insert(1);
		
		list.show();
//		list.insert(100, 0);
//		list.insert(20, 1);
//		list.insert(220, 3);
		String a=pc.makeString(list.head);
		System.out.println(pc.isPalin(a));
		list.deleteAt(pc.midIndex(list.head)-1);
		list.show();
		System.out.println(pc.length(list.head));
		System.out.println(pc.nFromEnd((list.head),2));  // 2nd Element from the end of LL.
		
	}
}
