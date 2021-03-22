import java.util.*;
public class Sumlist{
	public static void main(String[] args) {
		LinkedList<Integer>  l1=new LinkedList<Integer>();
		LinkedList<Integer>  l2=new LinkedList<Integer>();

		l1.add(7);
		l1.add(1);
		l1.add(6);

		l2.add(5);
		l2.add(9);
		l2.add(2);
		Iterator i1 = l1.iterator();
		Iterator i2 = l2.iterator();

		int s1 = 0,s2 = 0, k=1;
		
		while(i1.hasNext() || i2.hasNext()){
			 
			s1 +=   Integer.parseInt(String.valueOf(i1.next())) * k;
			System.out.println(s1);
			s2 +=   Integer.parseInt(String.valueOf(i2.next())) * k;
			System.out.println(s2);

			k *= 10;
		}
		int s3 = s1+s2;
		LinkedList<Integer>  l3=new LinkedList<Integer>();
		while(s3 != 0){
			k = s3%10;
			s3 = s3/10;
			l3.add(k);

		}
		System.out.print(l3);
	}
}