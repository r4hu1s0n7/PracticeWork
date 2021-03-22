import java.util.*;
public class ReverseKlist{
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
		ReverseKlist rk = new ReverseKlist();
		rk.add(1);
		rk.add(2);
		rk.add(3);
		rk.add(4);
		rk.add(5);
		rk.add(6);
		rk.add(7);
		rk.add(8);
		rk.add(9);

		Node cur = head.next,nex = head.next,pre = head.next, dummy=head;
		
		int c=0,k=3;
		while(cur.next != null ){
			c++;
			cur = cur.next;
		}
		while(c>=k){
			cur = pre.next;
			cur = cur.next;
			for(int i=1; i<k; i++){
				cur.next = nex.next;
				nex.next = pre.next;
				pre.next = nex;
				nex = cur.next;
			}
			pre = cur;
			c-=k;

		}
		head = dummy.next;
		rk.display();
	}
}