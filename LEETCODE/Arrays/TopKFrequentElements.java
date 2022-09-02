import java.util.HashMap;
import java.util.*;
import java.util.ArrayList;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums= {1,1,1,2,2,3};
        int k=2;
        int[] disp= new int[k];
        disp=topKFrequent(nums, 2);

        for (int i : disp) {
            System.out.println(i);
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
       
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        map=sortHashMap(map);
        Set<Integer> tempVar=map.keySet();
        ArrayList<Integer> keys= new ArrayList<>(tempVar);

        int[] ans=new int[k];
        
        for(int i=0;i<k;i++){
            ans[i]= keys.get(keys.size()-1);
            keys.remove(keys.size()-1);
        }
  
        return ans;
    }
    
    public static HashMap<Integer, Integer> sortHashMap(HashMap<Integer, Integer> hm) {
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
