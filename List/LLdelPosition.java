/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class LLdelPosition {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push (int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void deleteNode(int position){
        if(head == null)
            return;
        Node temp = head;
        if(position == 0){
            head = temp.next;
            return;
        }
        // Find the previous node of the node to be deleted
        for(int i=0; temp!=null && i<position-1; i++){
            temp = temp.next;
            if(temp == null || temp.next == null)
                return;
            Node next = temp.next.next;
            temp.next = next;
        }
    }
    
    public void print(){
        Node nnode = head;
        while(nnode != null){
            System.out.print(nnode.data+" ");
            nnode = nnode.next;
        }
    }
    public static void main(String args[]){
        LinkedList llist = new LinkedList();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
 
        System.out.println("\nCreated Linked list is: ");
        llist.print();
 
        llist.deleteNode(4);  // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion at position 4: ");
        llist.printList();
    }
}
