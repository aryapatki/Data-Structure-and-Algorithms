// Time Complexity:
// O(t * square root n)

// A for loop runs for t times and for each iteration a while loop runs for root n times making the time complexity of this program to be O(t * sq.rt(n)).

// Space Complexity:
// O(1)

// Since no effective extra space has been used, therefore the time complexity of the program remains constant.

import java.util.Scanner;

public class isPrime {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    System.out.println(checkPrime(t));
   } 

   public static String checkPrime(int t){
    String ans= "Prime";
    int div=2;
    for(;div*div<=t;div++){
        if(t%div==0)
            break;
    }

    if(div*div<=t)
        ans="Not Prime";
    return ans;
   }
}
