import java.util.*;
public class Pallindromelist{

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(2);
		l.add(1);
		int s1=0,s2 = l.size()-1,z=0;

		while(((s2/2)!=0)){
			if(l.get(s1) == l.get(s2)){
				s1++;s2--;
				z=0;
			}else{
				System.out.print("No");
				z=1;
				break;
			}
		}
		if(z==0){
			System.out.print("Yes");
		}
	}
}