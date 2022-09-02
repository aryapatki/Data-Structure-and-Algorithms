package Patterns;
import java.util.*;
/**
 * *** ***
 * **   **
 * *     *
 * **   **
 * *** ***
 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        for(int i=(num/2);i>=1;i--){
            for(int j=i+1;j>=1;j--) System.out.print("*\t");
            //  for(int j= num/2;j>=i;j--) System.out.print("\t");
            int c=(num/2)-i+1;
            for(int j=1;j<=2*c-1;j++)System.out.print("\t");
            for(int j=i+1;j>=1;j--) System.out.print("*\t");
            System.out.println();

        }

        for(int i=1; i<=num/2+1;i++){
            for(int j=1;j<=i;j++) System.out.print("*\t");
            int c=num/2 -i+2;
            for(int j=1;j<=2*c-1; j++) System.out.print("\t");
            for(int j=1;j<=i;j++) System.out.print("*\t");

            System.out.println();
        }

    
    }
}
