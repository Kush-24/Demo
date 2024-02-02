package Java.DataStructure.demo;

public class NoOfSubarray {
	
	public static void main(String[] args) {
		int arr[]={1,2,3};int c=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]);
				}
				System.out.println("");
				c++;
			}
		}
		System.out.println("Total subarray :"+c);
		
	}

}
