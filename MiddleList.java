public class MiddleList{

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
		MiddleList m = new MiddleList();
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(5);
		m.add(6);
		// m.add(7);

		Node cur1 = head, cur2 = head;

		while(cur1.next != null){
			cur2 = cur2.next;
			if(cur1.next == null || cur1.next.next == null)
				break;
			else
				cur1 = cur1.next.next;
			
		}
		System.out.println(cur2.data);
		m.delete(cur2.data);
		m.display();

	}	

}