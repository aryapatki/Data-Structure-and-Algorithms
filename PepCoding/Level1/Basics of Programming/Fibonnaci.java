import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int limit=scn.nextInt();

        fib(limit);
    }

    public static void fib(int limit){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=0; i<(limit-2); i++){
            int r= a+b;
            System.out.print(r+" ");
            a=b;
            b=r;
        }

    }
}
