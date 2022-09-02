import java.util.*;

public class ValidAnagram {
    public static boolean VAna(String a, String b){
        char[] AArray= a.toCharArray();
        char[] BArray= b.toCharArray();

        Arrays.sort(AArray);
        Arrays.sort(BArray);
        String aArr=new String(AArray);
        String bArr=new String(BArray);
        System.out.println(aArr);
        System.out.println(bArr);
        if(aArr.equals(bArr)) return true;
        else return false;
        // if(AArray.length!=BArray.length) return false;
        // for(int i=0; i<AArray.length;i++){
        //     if(AArray[i]!=BArray[i]) return false;
        // }

        // return true;
    }
    public static void main(String[] args) {
      String s="arya", t="yaar";
       
        System.out.println( VAna(s, t));
    }

    // public static void main(String[] args) {
    //     System.out.println(VAna("Arya", "yaar"));
    // }
}
