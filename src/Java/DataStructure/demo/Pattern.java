package Java.DataStructure.demo;

public class Pattern {
	
	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<8;j++)
			{ 
				int k=8;
				if(i==j || j==(k-i))
					System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
		int k=3,l=5;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<8;j++)
			{ 
				if(j==k || j==l)
					System.out.print(k);
				System.out.print(" ");
			}
			k--;l++;
			System.out.println();
		}
	}

}
