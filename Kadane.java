public class Kadane{
	public static void main(String[] args) {
		int a[] = {-1,-1,-1};
		int max = 0, sum = 0;
		for(int x: a){
			sum = sum + x;
			if(max < sum)
				max = sum;
			if(sum < 0)
				sum = 0;
		}
		System.out.print(max);
	}
}