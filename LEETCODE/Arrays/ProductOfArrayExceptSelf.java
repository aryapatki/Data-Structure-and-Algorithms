import java.util.HashMap;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        int[] ans=productExceptSelf(nums);

        for(int i:ans){
            System.out.println(i);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
    
        // HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[nums.length];
        int prod=1;
        for(int i: nums){
         prod*=i;
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                int prodTemp=1;
                for(int j=0;j<nums.length;j++){
                    if(j==i) continue;
                    prodTemp*=nums[j];
                }
                ans[i]=prodTemp;
            }
            else{
                ans[i]=prod/nums[i];
            }
         
        }
        return ans;
    }
}
