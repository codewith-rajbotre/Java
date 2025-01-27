import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map{
    public static void main(String[] args) {
        // Original map
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 10);
        map.put(4, 20);
        map.put(5, 30);
        
        // New map to store counts
        Map<Integer, Integer> map2 = new TreeMap<>();
        
        // Populating map2 with counts of values from map
        for (int key : map.keySet()) {
            map2.put(map.get(key), map2.getOrDefault(map.get(key), 0) + 1);
        }
        
        // Printing map2
        System.out.println(map2);
    }
}
