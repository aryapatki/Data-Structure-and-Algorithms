import java.util.*;

public class RotatingNumbers {
    // my solution solves 5 out of 6 cases
    // public static void main(String[] args) {
    //     // Scanner scn=new Scanner(System.in);
    //     // int num=scn.nextInt();
    //     // int k=scn.nextInt();
    //     // int num=72076559;
    //     // int k=-160451990;
    //     System.out.println("1");
    //     int num=1230456;
    //     int k=-5;
    //     System.out.println(rotNum(num, k));;
    // }


    // public static int rotNum(int num, int k){
    //     int numOfZeros=0;
    //     System.out.println("2");
    //     if (k==0) return num;
    //     else if(Integer.toString(num).length()==1) return num;
    //     else if (k>0){
    //         System.out.println("3");
    //         if(k>Integer.toString(num).length()) k=k%Integer.toString(num).length();
    //         while(k!=0){
    //             int r=num%10;
    //             if(r==0) {
    //                 numOfZeros++;
    //                 System.out.println("inside while loop if");
    //                 num=num/10;
    //                 k--;
    //             }
    //             else{
    //                 num=num/10;
    //                 num=num+ r*(int)Math.pow(10,Integer.toString(num).length()+numOfZeros);
    //                 numOfZeros=0;
    //                 k--;
    //                 System.out.println("inside while loop");
    //             }
               
    //         }

    //         return num;
    //     }

    //     else{
    //         k=Math.abs(k);
    //         if(k>Integer.toString(num).length()){
              
    //             k=k%Integer.toString(num).length();
    //             System.out.println("this is k after modulus"+k);
    //         }
    //         while(k!=0){
    //             System.out.println("inside while");
    //             int len=Integer.toString(num).length();
    //             int r=num/(int)Math.pow(10, len-1);
    //             num=num%(int)Math.pow(10, len-1);
    //             int temp=len-Integer.toString(num).length();

    //             num=num*(int)Math.pow(10, temp)+r;
    //             while(temp!=1) {
    //                 k--;
    //                 temp--;
    //             }
    //            System.out.println(num);
             
    //         }

    //         return num;
    //     }
        
    // }



    // pepcoding ans

    public static void main(String[] args) {
        // Scanner scn=new Scanner(System.in);
        // int num=scn.nextInt();
        // int k=scn.nextInt();
        // int num=72076559;
        // int k=-160451990;
       
        int num=1230456;
        int k=-5;
        System.out.println(rotNum(num, k));;
        
    }

    public static int rotNum(int num,int k){
        //finding length of Number
        int temp=num;
        int len=0;
        while(temp>0){
            temp=temp/10;
            len++;
        }

        // finding final k when ke is greater that len

        k=k%len;

        if(k<0) k=len+k;
        
        int div=1;
        int mul=1;
        for(int i=1;i<=len;i++){
            if(i<=k) div*=10;
            else mul*=10;
        }

        int ans= (num%div)*mul +(num/div);

        return ans;

    }
}
