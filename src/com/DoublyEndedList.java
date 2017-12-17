package com;

public class DoublyEndedList {
	private Node head;
	private Node tail;
	public void insertAtTail(int data){
		Node node=new Node(data);
		if(this.head==null){
			this.head=node;
			this.tail=node;
		}
		if(this.tail != null){
			this.tail.setNextNode(node);
			this.tail=node;
		}
	}
	@Override
	public String toString(){
		String result="{";
		Node current=this.head;
		while (current!=null){
			result+=current.toString()+",";
			current=current.getNextNode();		
		}
		result+="}";
		return result;
	}
}
