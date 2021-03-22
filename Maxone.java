public class Maxone{
	public static void main(String[] args) {
		int nums[] = {1,1,0,1,1,1};
		int m=0,c=0;
		for(int i:nums){
			if(i==1){
				c++;
			}else{
				if(c>m){
					m=c;

				}
				c=0;
			}
		}
		if(c>m)m=c;
		System.out.print(m);
	}
}