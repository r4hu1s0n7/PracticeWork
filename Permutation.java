import java.util.Arrays;
public class Permutation{
    public static void main(String[] args) {
        String s1 = "helo",s2 = "loleh";
        int a[] = new int[128];
        Arrays.fill(a,0);
        if (s1.length() != s2.length()){
            System.out.print("Not permutation");
            System.exit(0);
        }

        for(char c : s1.toCharArray()){
        	int asc = (int) c;
        	a[asc] += 1;
        }
        for(char c : s2.toCharArray()){
            int asc = (int) c;
            a[asc] -= 1;
        }
        for(int i : a){
            if(i >= 0){
                System.out.println("Not Permutation");
                System.exit(0);
            }
        }
        System.out.println("Permutation");
    }
}
waterbottle
aterbottlew
terbottlewa
erbottlewat