import java.util.*;
public class KthList{
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		Iterator i = l.iterator();
		Iterator j = l.iterator();
		int k = 3;
		while(i.hasNext() && k != 0){
			i.next();
			k--;
		}
		while(i.hasNext() && j.hasNext()){
			i.next();
			j.next();
		}
		System.out.print(j.next());
	}
}