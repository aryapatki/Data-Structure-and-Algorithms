/**
 * Palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
       String s="A man, a plan, a canal: Panama";
      System.out.println( isPalindrome(s));
    }

    // public static boolean isPalindrome( String s){
    //     //runtime=1945 ms
    //     //memory-574mb
    //     boolean ans=true;
    //     s=s.toLowerCase();
    //     for(int i=0;i<s.length();i++){
    //         if(Character.isLetterOrDigit(s.charAt(i)))
    //             continue;
    //         else{
    //             //  System.out.println(s.substring(0,i));
    //             //  System.out.println( s.substring(i+1));
    //             s=s.substring(0,i)+ s.substring(i+1); 
    //             // System.out.println(s);
    //             // System.out.println("-------------");
    //             i=i-1;
    //         }
    //     }
    //     System.out.println(s);
    //     System.out.println(s.length()/2);
        
    //      for(int i=0;i<s.length()/2;i++){
    //         if(s.charAt(i)!=s.charAt(s.length()-i-1))
    //             ans=false;
    //      }

        
    //     return ans;
    // }

    public static boolean isPalindrome( String s){
       
        boolean ans=true;
        s=s.toLowerCase();
        // for(int i=0;i<s.length();i++){
        //     if(Character.isLetterOrDigit(s.charAt(i)))
        //         continue;
        //     else{
        //         //  System.out.println(s.substring(0,i));
        //         //  System.out.println( s.substring(i+1));
        //         s=s.substring(0,i)+ s.substring(i+1); 
        //         // System.out.println(s);
        //         // System.out.println("-------------");
        //         i=i-1;
        //     }
        // }
        // System.out.println(s);
        // System.out.println(s.length()/2);
        
         for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                ans=false;
         }

        
        return ans;
    }
}