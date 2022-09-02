package GettingStarted;
import java.util.*;
public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        benBulbs(num);
    }

    public static void benBulbs(int num){
        for (int i=1; i*i<=num;i++){
           System.out.println(i*i);
        }
    }
}
