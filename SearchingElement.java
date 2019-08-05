package com.geeks.ds.tree.basics;

import java.util.LinkedList;
import java.util.Queue;

public class SearchingElement {
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
	static int searchInRecursion(Node root, int key) {
		int temp;
		if(root == null) {
			return -1;
		}else {
			if(key == root.data) {
				return 1;
			}else {
				temp = searchInRecursion(root.left,key);
				if(temp != -1) {
					return temp;
				}else {
					return searchInRecursion(root.right,key);
				}
			}
		}
	}
	static int searchWithoutRecurssion(Node root, int key) {
		Queue<Node> qr = new LinkedList<Node>();
		if(root == null) {
			return -1;
		}
		qr.add(root);
		while(!qr.isEmpty()) {
			Node last = qr.poll();
			if(last.data == key) {
				return 1;
			}
			if(last.left != null) {
				qr.add(last.left);
			}
			if(last.right != null) {
				qr.add(last.right);
			}
		}
		qr.peek();
		return -1;
		
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
		int searchResult = searchInRecursion(root,4);
		if(searchResult == -1) {
			System.out.println("Searching element is not present: ");
		}else {
			System.out.println("Searching element present: ");
		}
		int searchRes = searchWithoutRecurssion(root,9);
		if(searchRes == -1) {
			System.out.println("Searching element is not present: ");
		}else {
			System.out.println("Searching element present: ");
		}
		

	}

}
