/**
 * InverseNumber
 */
package GettingStarted;
import java.util.Scanner;

public class InverseNumber {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        System.out.println(toInverse(num));

    }

    public static int toInverse(int num){
        int ans=0;
        System.out.println("here");
        int count=1;
        while(num!=0){
            int r=num%10;
            ans=ans+count*(int)Math.pow(10, (r-1));
            count++;
            num=num/10;
        }
        return ans;
    }
}