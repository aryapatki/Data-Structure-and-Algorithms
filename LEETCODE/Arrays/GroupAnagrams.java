import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists=new ArrayList<>();
       HashMap<String, ArrayList<String>> map=new HashMap<>();
      
       for(String i:strs){
           boolean flag=false;
           char[] iArray= i.toCharArray();
           Arrays.sort(iArray);
           String iSorted=new String(iArray);
           if(map.containsKey(iSorted)) {
               map.get(iSorted).add(i);
               flag=true;
           }
           

           if(flag==false) {
               
               map.put(iSorted, new ArrayList<String>());
               map.get(iSorted).add(i);
           }
       }

       for (String i : map.keySet()) {
           lists.add(map.get(i));
       }

      return lists;
   }

}
