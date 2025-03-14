import java.util.*;
public class copyOfMethod{
     public static void main(String[] args) {
           
        int[] arr ={12,12,56,787,675,34};
        int [] temp = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(temp));
    
     }
}
