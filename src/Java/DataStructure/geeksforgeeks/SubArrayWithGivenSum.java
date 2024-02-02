package Java.DataStructure.geeksforgeeks;

public class SubArrayWithGivenSum {
	static String getIndex(int a[],int sum){
		String res="";
		for(int i=0;i<a.length;i++){
			int temp=0;
			for(int j=i;j<a.length;j++){
				temp+=a[j];
				if(temp==sum)
					return res+=++i+","+(++j);		
			}
		}
		return "-1";
	}

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println(getIndex(arr,15));
	}

}
