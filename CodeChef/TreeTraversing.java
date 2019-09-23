package com.geeks.ds.tree.traversing;

public class TreeTraversing {
	static class Node{
		int key;
		Node left,right;
		
		public Node(int item){
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	TreeTraversing(){
		root = null;
	}
	
	void printPreorder() {
		printPreorder(root);
	}
	
	void printPreorder(Node node) {
		if(node == null)
			return;
		System.out.print(node.key+" ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	void printPostOrder() {
		printPostOrder(root);
	}
	
	void printPostOrder(Node node) {
		if(node == null) {
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key+" ");
	}
	
	void printinorder() {
		printinorder(root);
	}
	
	void printinorder(Node node){
		if(node == null) {
			return;
		}
		printinorder(node.left);
		System.out.print(node.key+" ");
		printinorder(node.right);
	}
	
	public static void main(String[] args) {
		
		TreeTraversing tree = new TreeTraversing();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		System.out.println("PreOrder Traversing");
		tree.printPreorder();
		System.out.println(" ");
		System.out.println("Inorder Traversing");
		tree.printinorder();
		System.out.println(" ");
		System.out.println("Postorder Traversing");
		tree.printPostOrder();
	}

}
