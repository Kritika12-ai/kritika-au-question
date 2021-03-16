package com.automate;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(24);
		list.insert(3);
		list.insertAtStart(12);
		list.insertAt(1, 7);
		list.insertAt(9, 69);
		list.insertAt(4, 16);
		list.deleteAt(2);
		list.middle();
		list.insert(44);
		list.middle();
		list.show();
		System.out.println("----");
		list.reverse();
		list.show();
		
	}

}
