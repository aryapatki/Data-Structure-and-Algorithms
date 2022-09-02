package Patterns;
import java.util.*;
/*
 *    *
 *   ***
 *  *****
 *   ***
 *    *
 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i<=num/2) {
              for(int j=num/2; j>=i;j--){
                System.out.print("\t");
              }

              for(int j=1; j<=(2*i-1);j++){
                System.out.print("*\t");
              }

              System.out.println();
            } else {
                for(int j=(num/2+1);j<i;j++){
                    System.out.print("\t");
                }

                for(int j=1;j<=(2*(num-i+1)-1);j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}
