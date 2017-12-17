package com;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.insertAtHead(2);
		linkedList.insertAtHead(10);
		linkedList.insertAtHead(12);
		linkedList.insertAtHead(20);
		linkedList.insertAtHead(22);
		linkedList.insertAtHead(26);
		System.out.println(linkedList);
		System.out.println("Length: "+linkedList.length());
		linkedList.deleteHeadNode();
		System.out.println(linkedList);
		System.out.println("Length: "+linkedList.length());
		System.out.println("Found: "+linkedList.find(23));
	}
}
