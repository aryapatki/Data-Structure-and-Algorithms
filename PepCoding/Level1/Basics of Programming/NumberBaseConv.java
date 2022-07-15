import java.util.*;


public class NumberBaseConv  {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int b=scn.nextInt();
    // int n = 127;
    // int b = 8;
    int d = toDecimal(n, b);
    System.out.println(d);
  }

  public static int toDecimal(int n, int b) {
    int counter=0;
    int ans_num=0;
    while( n!=0){
        int r=n%10;
        ans_num=ans_num+ r*(int)Math.pow(b, counter);
        counter++;
        n=n/10;
    } 
    return ans_num;
  }
}