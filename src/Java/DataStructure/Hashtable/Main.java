package Java.DataStructure.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hashtable=new Hashtable();
		Student s1=new Student("Kushagra", "123", 5.6);
		Student s2=new Student("rahul", "234", 1.8);
		Student s3=new Student("sagar", "333", 8.0);
		Student s4=new Student("sagar", "321", 8.0);
		
		int s1key=hashtable.toHashCode(s1.getRollNo());
		int s2key=hashtable.toHashCode(s2.getRollNo());
		int s3key=hashtable.toHashCode(s3.getRollNo());
		int s4key=hashtable.toHashCode(s4.getRollNo());
		
		hashtable.insert(s1key, s1);
		hashtable.insert(s2key, s2);
		hashtable.insert(s3key, s3);
		hashtable.insert(s4key, s4);
		
		hashtable.showData();
		hashtable.deleteStd(s3.getRollNo());
		//hashtable.showData();
	}
}
