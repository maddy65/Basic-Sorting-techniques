package com.geeks.ds.tree.summation;

public class SumAllNodes {
	static class Node  
	{  
	    int key;  
	    Node left, right;  
	} 
	
	static Node newNode(int key)  
	{  
	    Node node = new Node();  
	    node.key = key;  
	    node.left = node.right = null;  
	    return (node);  
	}  
	
	public static void main(String[] args) {
		Node root = newNode(1);  
	    root.left = newNode(2);  
	    root.right = newNode(3);  
	    root.left.left = newNode(4);  
	    root.left.right = newNode(5);  
	    root.right.left = newNode(6);  
	    root.right.right = newNode(7);  
	    root.right.left.right = newNode(8);  
	    
	    int Sum = calculateSum(root);
	    System.out.println("Total Sum is : "+Sum);
	}

	private static int calculateSum(Node root) {
		if(root ==null)
			return 0;
		
		return (root.key + calculateSum(root.left) + calculateSum(root.right));
	}

}
