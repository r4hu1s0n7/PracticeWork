public class Pascal{
	public static void main(String[] args) {
		int n = 10;
		int xx = 1;
		for(int i=0; i<n;i++){
			for(int s=0;s<n-i;s++){
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++){
				if (j==0 || i ==0)
					xx = 1;
				else
					xx = (xx * (i-j+1))/j;
				System.out.print(xx + " ");
			}
			System.out.println();
		}
	}
}