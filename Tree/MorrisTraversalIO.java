package com.geeks.ds.tree.traversing;

public class MorrisTraversalIO {
	
	static class Node{
		int key;
		Node left,right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	
	Node root;
	
	void printInorder() {
		Node current, previous;
		if(root == null) {
			return;
		}
		current = root;
		while(current != null) {
			if(current.left == null) {
				System.out.print(current.key+" ");
				current = current.right;
			}else {
				previous = current.left;
				while(previous.right != null && previous.right != current) {
					previous = previous.right;
					if(previous.right == null) {
						previous.right = current;
						current = current.left;
					}else {
						previous.right = null;
						System.out.print(current.key+" ");
						current = current.right;
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		MorrisTraversalIO tree = new MorrisTraversalIO();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.printInorder();

	}

}
