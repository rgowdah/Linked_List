package com;

public class DoublyLinkedList {
private DoublyLinkedNode head;
public void insertAtHead(int data){
	DoublyLinkedNode doublyLinkedNode=new DoublyLinkedNode(data);
	doublyLinkedNode.setNextNode(head);
	if(this.head!=null){
		this.head.setPreviousNode(doublyLinkedNode);
	}
	this.head=doublyLinkedNode;
}

public int length(){
	if(head==null)return 0;
	int length=0;
	DoublyLinkedNode current=this.head;
	while(current!=null){
		length++;
		current=current.getNextNode();
	}
	return length;

}
@Override
public String toString(){
	String result="{";
	DoublyLinkedNode current=this.head;
	while (current!=null){
		result+=current.toString()+",";
		current=current.getNextNode();		
	}
	result+="}";
	return result;
}
}
