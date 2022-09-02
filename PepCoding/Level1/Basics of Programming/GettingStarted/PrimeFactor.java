package GettingStarted;
import java.util.*;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();

        primFactor(num1);
    }

    public static void primFactor(int num){
        int factor=2;
        while(num!=1){
            if(num%factor==0 ){
                System.out.println(factor);
                num=num/factor;
            }
            else{
                while(num%factor!=0) factor++;
            }
        }
    }
}
