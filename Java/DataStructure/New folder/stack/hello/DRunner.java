package com.wipro.stack;

public class DRunner {

	public static void main(String[] args) {
		DStack d=new DStack();
		d.push(9);
		d.show();
		d.push(10);
		d.push(45);
		d.push(67);
		d.show();
		System.out.println(d.size());
		d.push(9);
		d.push(10);
		d.show();
		d.pop();
		d.show();
		d.pop();
		d.show();
		d.pop();
		d.show();
		d.pop();
		d.show();
		d.pop();
		d.show();
		d.pop();
		d.show();

	}

}
