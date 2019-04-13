package myAlgo;

import java.util.LinkedList;

public class listReverse {

	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next = null;
		}
	}
Node reverse(Node currentNode) {
	Node reverseNode= null;
	Node nextNode;
	while(currentNode!= null)
	{
		nextNode = currentNode.next;
		currentNode.next = reverseNode;
		reverseNode = currentNode;
		currentNode = nextNode;
	}
	return reverseNode;
}
	void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data+ "");
			node = node.next;
		}
	}
	public static void main(String[] args) { 
		listReverse list = new listReverse(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
          
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
}
