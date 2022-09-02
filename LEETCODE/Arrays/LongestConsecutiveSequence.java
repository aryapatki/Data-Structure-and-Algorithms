import java.util.Arrays;
import java.util.Collections;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        System.out.println("count is "+longestConsecutive(nums)); 
    }

    public static int longestConsecutive(int[] nums) {
        int countFinal=1;
        
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.println(i);
        }
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println("=============");
        int currNum=nums[0];
        int countTemp=1;
        for(int i=1;i<nums.length;i++){
            System.out.println("i= "+i+" nums[i] = "+nums[i]);
            if(nums[i]==(currNum+1)){
               
                countTemp++;
                currNum++;
                System.out.println("count set to "+countTemp+"for current number"+currNum);
            }
         else if(nums[i]==currNum){

            }
            else{
                if(countTemp>countFinal) countFinal=countTemp;
                countTemp=1;
                currNum=nums[i];
                System.out.println("currNum set to"+ currNum);
            }
        }
        if(countTemp>countFinal) countFinal=countTemp;
        return countFinal;
    }
}
