public class Rotate{
	public static void main(String[] args) {
		String s1 = "waterbottle" , s2 = "erbottlewt" ;
		if (s1.length() != s2.length()){
			System.out.print(false);
		}
		else{
		String s1s2 = s1 + s2;
		System.out.print(s1s2.contains(s2)); 
		}
		
	}
}