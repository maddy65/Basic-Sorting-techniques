/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// This programm show how to insert a new Node
package javaapplication2;
import java.util.*;
import java.util.LinkedList.*;

/**
 *
 * @author madhurendra
 */
public class LListInsertion {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    
    /* This method shows insert a new node from the front end
    *  Time complexity is O(1)
    */
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    /* This method insert a new node at after a given node
    *  Time complexity is O(1)
    */
    
    public void inserAfter(Node prev_node, int new_data){
        if(prev_node == null){
            System.out.println("The given previous node cannot be null");
            return ;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    /* This method insert a new node at end a given node
    *  Time complexity is O(n)
    */
    public void append(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
            last.next = new_node;
            return;
        }
        
    }
    
    public void print(){
        Node pnode = head;
        while(pnode != null){
            System.out.println(pnode.data+" ");
            pnode = pnode.next;
        }
    }
    
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.append(6);

        list.push(7);
        list.push(1);
        list.append(4);
        list.insertAfter(list.head.next, 8);
        System.out.println("\n Linked list is: ");
	list.print();
    }
}
