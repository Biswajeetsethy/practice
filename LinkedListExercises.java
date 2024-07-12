package com.DSA;

import com.DSA.LinkedListExercises;
import com.DSA.LinkedListExercises.Node;

public class LinkedListExercises {

	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value=value;
		}
	}
	
	Node head =null;
	Node tail = null;
	
	public void addNodeAtEnd(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
				tail.next = newNode;
				newNode.next = null;
				tail = newNode;
		}
	}
	public void printLinkedList(Node headNode) {
		Node current = headNode;
		while(current !=null) {
			System.out.println(current.value);
			current = current.next;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExercises L = new LinkedListExercises();
		L.addNodeAtEnd(10);
		L.addNodeAtEnd(20);
		L.addNodeAtEnd(30);
		L.addNodeAtEnd(40);
		L.printLinkedList(L.head);
	}

}
