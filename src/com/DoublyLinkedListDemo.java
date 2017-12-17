package com;

public class DoublyLinkedListDemo {
public static void main(String[] args) {
	DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
	
	doublyLinkedList.insertAtHead(20);
	doublyLinkedList.insertAtHead(15);
	doublyLinkedList.insertAtHead(21);
	doublyLinkedList.insertAtHead(1);
	System.out.println(doublyLinkedList);
}
}
