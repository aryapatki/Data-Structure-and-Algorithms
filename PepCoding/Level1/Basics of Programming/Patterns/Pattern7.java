package Patterns;
import java.util.*;
/**
 * *
 *  *
 *   *
 *    *
 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i-1;j++) System.out.print("\t");
            System.out.print("*\t");
            System.out.println();
          
        }
    }
}
