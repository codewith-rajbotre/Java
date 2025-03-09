import java.util.*;

public class hash{
    public static void main(String[] args) {
        Map <String, Integer> h = new HashMap<>();
        h.put("A" ,90);
        h.put("Hello",33);
        System.out.println(h);
        for(String key : h.keySet()){
            System.out.println(key +" "+h.get(key));
        }
    }
}