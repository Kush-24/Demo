package Java.DataStructure.BST;

public class Runner {

	public static void main(String[] args) {
		BinaryTree t=new BinaryTree();
		t.root=new Node(1);									
		t.root.left=new Node(2);
		t.root.right=new Node(3);
		t.root.left.left=new Node(4); // 2 node left child.
	
	}
}
