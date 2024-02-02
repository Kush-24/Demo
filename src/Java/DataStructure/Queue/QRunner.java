package Java.DataStructure.Queue;

public class QRunner {

	public static void main(String[] args) {
		Queue q=new Queue();
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		q.add(10);
		q.show();
		q.add(20);
		q.show();
		System.out.println(q.element());
		System.out.println(q.size());

		q.remove();
		System.out.println(q.size());
		System.out.println(q.element());
	}

}
