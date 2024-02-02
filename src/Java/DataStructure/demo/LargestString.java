package Java.DataStructure.demo;

public class LargestString {
	static boolean isPalin(String a){
		if(a.equals(new StringBuffer(a).reverse().toString()))
		return true;	
	return false;
	}
	
	static String getString(String a,int n)
	{
		String res="",t="";int max=-1;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{	t=a.substring(i,j);
				if(isPalin(t))
				{
					if(t.length()>max)
					{
					 res=t;
					 max=t.length();
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b="acgtgtcaaaatcg";
		System.out.println(getString(b,b.length()));
	}

}
