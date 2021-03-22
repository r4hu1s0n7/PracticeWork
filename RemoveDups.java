import java.util.*;
public class RemoveDups{

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


	public static void main(String[] args) {

		RemoveDups rd = new RemoveDups();

		rd.add(1);
		rd.add(2);
		rd.add(3);
		rd.add(4);
		rd.add(1);
		rd.add(2);
		rd.add(4);
		
		Set<Integer> s = new HashSet<Integer>();

		Node cur = head;
		cur = head;
		while(cur.next != null){
			if (s.contains(cur.data)){
				rd.delete(cur.data);
			}
			else{
				
				s.add(cur.data);
			}
			cur = cur.next;
		}

		if (s.contains(cur.data)){
				rd.delete(cur.data);
		}


		rd.display();
		
	}
}