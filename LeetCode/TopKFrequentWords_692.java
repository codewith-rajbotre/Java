
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class TopKFrequentWords_692 {

    public static void main(String[] args) {

        String exampleArray[] = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        
        Map<String, Integer> m1 = new HashMap<>();
        for(String s: exampleArray){
            m1.put(s, m1.getOrDefault(s,0)+1);
        }
        List<String> returnList = new ArrayList<>(m1.keySet());

        Collections.sort(
           returnList, (a,b)->{
                if(m1.get(a).equals(m1.get(b))){
                    return a.compareTo(b);
                }
                return m1.get(b) - m1.get(a);
            }
        );
        

        System.out.println(returnList.subList(0,k));

    }
}
