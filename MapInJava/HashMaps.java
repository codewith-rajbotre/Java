import java.util.*;

public class HashMaps{
     public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<>();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter key you want to enter :");
         String i = sc.next();
            // Adding key-value pairs
            map.put(1, "Apple");
            map.put(2, "Banana");
            map.put(3, "Cherry");

            //System.out.println(map.containsKey(1));

          if(map.containsValue(i)==false){
               map.put(9, i.);
          }
          else{
            map.remove(2);
          }
        System.out.println(map); // Output: {1=Apple, 2=Banana, 3=Cherry}
    }
}