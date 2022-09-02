
import java.util.*;
public class ContainsDuplicate {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
      System.out.println( containsDup(arr)); 
    }

//// took 31 ms
// 75 MB of memory
    // public static boolean containsDup(int[] nums) {
    //     boolean ans=false;
    //     Arrays.sort(nums);
    //     // System.out.println(nums.length);
    //     for(int i=0; i<nums.length-1;i++){
    //         if(nums[i]==nums[i+1]){
    //             ans=true;
    //             break;
    //         }
    //     }
    //     return ans;
    // }
//10 ms
//68.6 MB
    public static boolean containsDup(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
		 for(int i : nums)
			 if(!set.add(i))// if there is same
				 return true; 
		 return false;
    }

}
