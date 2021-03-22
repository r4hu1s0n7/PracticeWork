import java.util.*;
public class Duplicate{
	public static void main(String[] args) {
		int a[] = {1,2,2,3,0};
		Set<Integer> set = new HashSet<Integer>();
		for(int x : a){
			set.add(x);
		}
		System.out.print(set);
	}
}