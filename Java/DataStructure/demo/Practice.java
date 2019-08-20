package com.wipro.demo;

public class Practice {
	static int sum(int n) {
		if (n == 1)
			return 1;
		if(n%2==0)
		n-=1;
		return n + sum(n-2);
	}
	static void decimalToBinary(int n) {
		if(n==1)
			System.out.print("1");
		else{
			decimalToBinary(n/2);
			System.out.print(n%2);
		}
		
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
		decimalToBinary(10);

	}

}
