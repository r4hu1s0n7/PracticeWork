	static class Node{
		int data;
		Node next;

		Node(int x){
			data = x;
			next = null;
		}
	}

	static Node head = null, tail = null;

	public void add(int x){
		Node n = new Node(x);

		if(head == null){
			head = n;
			tail = n;
		}else{
			tail.next = n;
			tail = n;
		}
	}

	public void delete(int x){
		Node prev = head,current = head;

		if(head.data == x){
			prev = head;
			head = head.next;
			prev = null;
			return;
		}

		while(current.next != null){
			current = current.next;
			if(current.data == x){
				prev.next = current.next;
				current.next = null;
			}

			prev = current;
		}
	}


	public void display(){

		Node current = head;

		if(head == null){
			System.out.print("Empty");
			return;
		}
        while(current != null) {    
                
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();
	}
----------------------------------------------------------------------------
  
package com.journaldev.ds;

public class LinkedList {

	private class Node {

		int data;

		Node next;

	}

	private Node head;

	private Node tail;

	private int size;

	public int size() {

		return this.size;

	}

	public int getFirst() throws Exception {

		if (this.size == 0) {

			throw new Exception("LL is Empty.");

		}

		return this.head.data;

	}

	public int getLast() throws Exception {

		if (this.size == 0) {

			throw new Exception("LL is Empty.");

		}

		return this.tail.data;

	}

	public int getAt(int idx) throws Exception {

		if (this.size == 0) {

			throw new Exception("LL is Empty.");

		}

		if (idx < 0 || idx >= this.size) {

			throw new Exception("Invalid Index.");

		}

		Node temp = this.head;

		for (int i = 1; i <= idx; i++) {

			temp = temp.next;

		}

		return temp.data;

	}

	private Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {

			throw new Exception("LL is Empty.");

		}

		if (idx < 0 || idx >= this.size) {

			throw new Exception("Invalid Index.");

		}

		Node temp = this.head;

		for (int i = 1; i <= idx; i++) {

			temp = temp.next;

		}

		return temp;

	}

	public void addLast(int item) {

		// create

		Node nn = new Node();

		nn.data = item;

		nn.next = null;

		// attach

		if (this.size > 0)

			this.tail.next = nn;

		// dm update

		if (this.size == 0) {

			this.head = nn;

			this.tail = nn;

			this.size += 1;

		} else {

			this.tail = nn;

			this.size += 1;

		}

	}

	public void addFirst(int item) {

		// create

		Node nn = new Node();

		nn.data = item;

		nn.next = null;

		// attach

		nn.next = this.head;

		// dm update

		if (this.size == 0) {

			this.head = nn;

			this.tail = nn;

			this.size++;

		} else {

			this.head = nn;

			this.size++;

		}

	}

	public void addAt(int item, int idx) throws Exception {

		if (idx < 0 || idx > this.size) {

			throw new Exception("Invalid Index.");

		}

		if (idx == 0) {

			addFirst(item);

		} else if (idx == this.size) {

			addLast(item);

		} else {

			// create

			Node nn = new Node();

			nn.data = item;

			nn.next = null;

			// attach

			Node nm1 = getNodeAt(idx - 1);

			Node np1 = nm1.next;

			nm1.next = nn;

			nn.next = np1;

			// dm

			this.size++;

		}

	}

	public int removeFirst() throws Exception {

		if (this.size == 0) {

			throw new Exception("LL is empty.");

		}

		Node temp = this.head;

		if (this.size == 1) {

			this.head = null;

			this.tail = null;

			this.size = 0;

		} else {

			this.head = this.head.next;

			this.size--;

		}

		return temp.data;

	}

	public int removeLast() throws Exception {

		if (this.size == 0) {

			throw new Exception("LL is empty.");

		}

		Node temp = this.tail;

		if (this.size == 1) {

			this.head = null;

			this.tail = null;

			this.size = 0;

		} else {

			Node sm2 = getNodeAt(this.size - 2);

			sm2.next = null;

			this.tail = sm2;

			this.size--;

		}

		return temp.data;

	}

	public int removeAt(int idx) throws Exception {

		if (this.size == 0) {

			throw new Exception("LL is empty.");

		}

		if (idx < 0 || idx >= this.size) {

			throw new Exception("Invalid Index.");

		}

		if (idx == 0) {

			return removeFirst();

		} else if (idx == this.size - 1) {

			return removeLast();

		} else {

			Node nm1 = getNodeAt(idx - 1);

			Node n = nm1.next;

			Node np1 = n.next;

			nm1.next = np1;

			this.size--;

			return n.data;

		}

	}

	public void display() {

		System.out.println("----------------------");

		Node temp = this.head;

		while (temp != null) {

			System.out.print(temp.data + " ");

			temp = temp.next;

		}

		System.out.println(".");

		System.out.println("----------------------");

	}

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();

		list.addLast(10);

		list.addLast(20);

		list.addLast(30);

		list.addLast(40);

		// this will display the list

		list.display();

		// first element i.e.10 should be printed

		System.out.println(list.getFirst());

		// last element i.e.40 should be printed

		System.out.println(list.getLast());

		// element at 3rd index i.e.40 should be printed

		System.out.println(list.getAt(3));

		// a memory address of a node should be printed

		System.out.println(list.getNodeAt(3));

		// 10 should be removed and printed

		System.out.println(list.removeFirst());

		// 40 should be removed and printed

		System.out.println(list.removeLast());

		// list without 10 and 40 should be printed

		list.display();

		// 100 should be added at first

		list.addFirst(100);

		list.display();

		// 30 should be removed

		list.removeAt(2);

		// 300 should be added at 2nd index

		list.addAt(300, 2);

		list.display();

	}

}
