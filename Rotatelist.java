public class Rotatelist{

	private class Node {

		int data;
		Node next;

	}
	 Node head;

	 Node tail;

	 int size;

	public int size() {

		return this.size;

	}	
	public Node getFirst()  {

		if (this.size == 0) {
			System.out.print("Empty");
			return null;
		}
		return this.head;
	}

	public Node getLast()  {

		if (this.size == 0) {
			System.out.print("Empty");
			return null;
		}
		return this.tail;
	}
    

	public void add(int item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size > 0)
			this.tail.next = nn;

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size += 1;
		} else {
			this.tail = nn;
			this.size += 1;
		}
	}
	public int getSize(){
		return this.size;
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



	public void display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Rotatelist r = new Rotatelist();
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(4);
		r.add(5);
		r.add(6);
		r.add(7);
		r.add(8);
		r.add(9);
		int k=6;
		Node cur = r.getFirst();
		r.getLast().next = r.getFirst();
		k = r.getSize() - k%r.getSize();
		while(k-->0){
			cur = cur.next;
			
		}
		r.head = cur.next;
		cur.next = null;
		r.display();

	}
}