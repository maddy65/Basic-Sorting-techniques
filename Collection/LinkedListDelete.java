/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.LinkedList.*;
import java.util.*;

public class LinkedListDelete {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    // Method for delete
    void delete_node(int key){
        Node temp = head, prev = null;
        // If key id present in first node
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while(temp !=null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        // If key is not present
        if(temp == null)
            return;
        prev.next = temp.next;
    }
    
    // Method for insert
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printlist(){
        Node tnode = head;
        while(tnode != null){
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    
    public static void main(String args[]){
        LinkedList llist = new LinkedList();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
 
        System.out.println("\nCreated Linked list is:");
        llist.printList();
 
        llist.deleteNode(1); // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
    }
}
