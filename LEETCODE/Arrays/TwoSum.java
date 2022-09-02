import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums= {22222,22222};
        int target=44444;
     
        int[] ans=twoSum(nums,target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, ArrayList<Integer>> map= new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(i);
                map.put(nums[i], temp);
            }
            System.out.println("inside furst for "+map);
        }
        System.out.println(map);
        for (Integer keyI : map.keySet()) {
            Integer toBeFound=(Integer)target-keyI;
            System.out.println("-------------");
            System.out.println(toBeFound.TYPE);
            System.out.println(keyI.TYPE);
            System.out.println((Integer)toBeFound==(Integer)keyI);
            System.out.println(map.get(keyI).size()>1);
            if(toBeFound.equals(keyI) && map.get(keyI).size()>1) {
                System.out.println("inside first if");
                ans[0]=map.get(keyI).get(0);
                ans[1]=map.get(keyI).get(1);
                return ans;
            }
            
            if(map.containsKey(toBeFound)){
                System.out.println("inside if");
                ans[1]=map.get(toBeFound).get(0);
                ans[0]=map.get(keyI).get(0);
                return ans;
            }
            // else if(map.containsKey(toBeFound) && map.get(keyI)==map.get(toBeFound)){
            //     System.out.println("inside else if");
            //     System.out.println(map);
            //     map.remove(keyI);
            //     System.out.println(map);
            //     if(map.containsKey(toBeFound)){
            //         System.out.println("Inside last if");
            //         ans[1]=map.get(toBeFound+1);
            //         ans[0]=map.get(keyI);
            //         return ans;
            //     }
                
            // }
        }
        
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
}
