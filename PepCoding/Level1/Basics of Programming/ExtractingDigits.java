import java.util.*;
    
    public class ExtractingDigits{
    
    public static void main(String[] args) {
      // write your code here  
       Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
         int l=String.valueOf(num).length();
        int div=(int) Math.pow(10,(l-1));
        
        while(div!=0){
            System.out.println(num/div);
            num=num%div;
            div/=10;
        }
        
     }
    }