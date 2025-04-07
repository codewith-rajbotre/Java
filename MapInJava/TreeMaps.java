
import java.util.*;
class TreeMaps {

    public static void main(String[] args) {
        System.out.println("Tree Map");
        TreeMap<Integer, Integer> m = new TreeMap<>();
        m.put(3, 11);
        m.put(66, 56);
        m.put(4, 54);
        System.out.println(m);
        for (Integer key : m.keySet()) {
            System.out.println(key + " -> " + m.get(key));
        }

        for (Integer value : m.values()) {
            System.out.println(value);
        }
        

        //Using Iterator
        Iterator<Integer> keyIterator = m.keySet().iterator();
        while(keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println(key + " -> " + m.get(key));
        }
        
        m.forEach((key, value )-> System.out.println(key+" : "+value ));


       
    }

}
