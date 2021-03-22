import java.util.Arrays;
public class Nextpermutation{
	public static void main(String[] args) {
		int nums[] = {2,1,3};
   int x,y,z,k;
		x=y=z=0;
		k=999999;
		for(int i=0; i<nums.length-1;i++){
			if (nums[i]<nums[i+1]) {
				x=i;
				z=1;
				
			}

		}
			if (z ==0){
				Arrays.sort(nums);
				System.out.print(Arrays.toString(nums));
			}
        if(z==1){
		for(int  i=0; i<nums.length ;i++){
			if (nums[i]>nums[x] && nums[i]<k){
				y=i;
				k=nums[i];
				
			}
			
		}
		z=nums[x]; nums[x]=nums[y]; nums[y]=z;
		Arrays.sort(nums,x+1,nums.length);
		System.out.print(Arrays.toString(nums));
        }
	}
}

// gfg approach
// find first non descending value 
// swap it with next greater element 
// sort string between 2 points

