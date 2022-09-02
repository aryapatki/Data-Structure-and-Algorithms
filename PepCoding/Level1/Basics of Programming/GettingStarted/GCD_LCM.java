package GettingStarted;

import java.util.*;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();

        printGCD_LCM(num1,num2);
    }

    public static void printGCD_LCM(int num1, int num2){
        int n1=num1, n2=num2;
        int gcd;
        int rem=1;
       
            while(n1%n2!=0){
                rem=n1%n2;
                n1=n2;
                n2=rem;
            }

            gcd=n2;
            System.out.println(gcd);


        
        int lcm= (num1*num2)/gcd;
        System.out.println(lcm);
    }
}
