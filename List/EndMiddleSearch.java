package com.geeks.ds.LinkedList.Single;

public class EndMiddleSearch {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(" ");
	}
	
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;
		if(head == null) {
			head = new_node;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new_node;
		return;
	}
	
	public int findNode(int index) {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			if(count == index) {
				return temp.data;
			}
			count ++;
			temp = temp.next;
		}
		assert(false); 
        return 0; 
	}
	
	public void fromEndNode(int index) {
		Node temp = head;
		int length = 0;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
		if(length < index) {
			return;
		}
		temp = head;
		for(int i=1; i< length-index+1; i++) {
			temp = temp.next;
		}
		System.out.println("Given index value from the end is: "+temp.data);
	}
	
	public void getMiddleNode() {
		Node current = head;
		Node forward = head;
		if(head != null) {
			while(current != null && current.next != null) {
				current = current.next.next;
				forward = forward.next;
			}
			System.out.println("The middle element is : "+forward.data);
		}
	}
	public void getFrequency(int value) {
		Node temp = head;
		int frequency = 0;
		while(temp != null) {
			if(temp.data == value) {
				frequency++;
			}
			temp = temp.next;
		}
		System.out.println("The frequency of "+value+" is: "+frequency);
	}

	public static void main(String[] args) {
		EndMiddleSearch ems = new EndMiddleSearch();
		ems.insert(1);
		ems.insert(2);
		ems.insert(3);
		ems.insert(4);
		ems.insert(5);
		ems.insert(5);
		System.out.println("List to be seacrhed : ");
		ems.printList();
		int value = ems.findNode(22);
		System.out.println("Given index value is :"+value);
		System.out.println(" ");
		ems.fromEndNode(2);
		ems.getMiddleNode();
		ems.getFrequency(5);

	}

}
