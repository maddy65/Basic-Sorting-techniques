
import java.util.LinkedList;
import java.util.Queue;

public class SizeOfTree {
	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	static Node root;
	static Node temp = root;
	static void inorder(Node temp) {
		if(temp == null) {
			return;
		}
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	
	static int sizeOfTree(Node root) {
		if(root == null) {
			return 0;
		}
		else return (sizeOfTree(root.left) +1 +sizeOfTree(root.right));
	}
	
	static int sizeOfTreeWithoutRec(Node root) {
		Queue<Node> qr = new LinkedList<Node>();
		int count = 0;
		if(root == null) {
			return 0;
		}
		qr.add(root);
		while(!qr.isEmpty()) {
			Node last = qr.poll();
			count++;
			if(last.left != null) {
				qr.add(root.left);
			}
			if(last.right != null) {
				qr.add(root.right);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		
		System.out.println("Inorder traversal before insertion: ");
		inorder(root);
		System.out.println(" ");
		System.out.println("Size of tree with recursion: "+sizeOfTree(root));
		System.out.println("Size of tree without recursion: "+sizeOfTreeWithoutRec(root));
	}

}
