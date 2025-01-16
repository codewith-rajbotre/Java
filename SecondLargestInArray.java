import java.util.*;
public class SecondLargestInArray {
    public static void main(String[] args) {
        int arr[]={3,4,6,7,8,9,11,2,34,44};
        Arrays.sort(arr);
     
      
        int b=arr.length;
        System.out.println(arr[b-2]);
    }
    
}
