package com.automate;

public class LinkedList {

	Node head;
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void show()
	{
		Node node = head;
		while(node != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		
	}
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	public void insertAt(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0)
		{
			insertAtStart(data);
		}
		else
		{
		
			Node n = head;
			for(int i = 0; i < index -1; i++)
			{
				if(n != null)
				{
					n = n.next;
				}
				else
				{
					System.out.println("index does not exist");
					return;
				}
				
			}
			
			node.next = n.next;
			n.next = node;
		}
	}
	public void deleteAt(int index)
	{
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index -1; i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}
	
	public void middle()
	{
		Node node = head;
		int count = 0;
		while(node != null)
		{
			count++;
			
			node = node.next;
		}
		node = head;
		for(int i = 0; i < count/2; i++)
		{
			node = node.next;
		}
		System.out.println("middle node is: "+node.data);
	}
	
	public void reverse()
	{
		Node n = head;
		while(n.next != null)
		{
			n = n.next;
		}
		while(head != n)
		{
			Node temp = head; // head/temp - 1
			head = head.next; // temp = 1, head - 2 temp - 1-2-6-8
			temp.next = null; // temp = 1-null
			 
			
			// 8-1 insert 2
			temp.next = n.next; // temp, n = 2
			n.next = temp;	// n.next break and connect with temp
		}
		
	}
	
}
