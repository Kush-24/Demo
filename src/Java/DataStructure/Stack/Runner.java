package Java.DataStructure.Stack;

public class Runner {

	public static void main(String[] args) {
		Stack num=new Stack();
		num.push(10);
		num.push(20);
		num.push(30);
		num.push(40);
		System.out.println("Size "+num.size());
		num.show();
		System.out.println("pop "+num.pop());
		System.out.println("peek "+num.peek());
		num.push(50);
		num.show();
		System.out.println(num.isEmpty());
		System.out.println("Size"+num.size());
		int t=4;
		while(t--!=0)
		num.pop();
		
		System.out.println(num.isEmpty());
		System.out.println("Size "+num.size());
		System.out.println("pop "+num.pop());
	}
}
