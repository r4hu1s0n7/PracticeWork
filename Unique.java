import java.util.Arrays;
public class Unique{
    public static void main(String[] args) {
        String s = "helo       ";
        Boolean a[] = new Boolean[128];
        Arrays.fill(a,false);
        for(char c : s.toCharArray()){
        	int asc = (int) c;
        	if(a[asc]){
        	System.out.println("Not unique");
        	break;
        	}
        	a[asc] = true;
        }
    }
}