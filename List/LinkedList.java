package GeeksSS;

public class LinkedList {

		Node head;
		class Node{
		    Node next;
			int data;
			Node(int d){
				data = d;
				next = null;
			}
		}
	
	void delLesserNodes(){
		reverseList();
		_delLesserNode();
		reverseList();
	}
	private void _delLesserNode() {
		Node current = head;
		Node maxnode = head;
		Node temp;
		while(current != null && current.next != null){
			if(current.next.data < maxnode.data){
				temp = current.next;
				current.next = temp.next;
				temp = null;
			}else{
				current = current.next;
				maxnode = current;
			}
		}
		
	}
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	private void reverseList() {
		
	}
	public static void main(String[] args) {
		

	}

}
