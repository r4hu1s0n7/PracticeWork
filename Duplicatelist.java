public class Duplicatelist{
	Node head;

	static class Node{
		int data;
		Node next;

		Node(int x){
			self.data = x;
			next = null;
		}
	}

	static void insert(Duplicatelist list, int x){
		Node n = new Node(x);

		if (list.head == null) { 
            list.head = new_node; 
        }else{
        	Node last = list.head;
        	while (last.next != null) { 
                last = last.next; 
            }
            last.next = new_node; 
        }

        return list; 
	}
	public static void main(String[] args) {
		
		head.next = node;
	    list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8);

	}
}