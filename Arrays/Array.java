
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Array{
    public static void main(String[] args) {
       int arr[] = new int[25];
       int index=0;
        Set <Integer> s = new TreeSet<>();
        for(int i=2 ; i<=100 ; i++){
                 int num =i;
                 int count =0;
                 for(int j=2 ; j<=num ;j++){
                    
                    if(num % j ==0){
                        count++;
                    }
                 }
                 if(count ==1){
                   s.add(i);
                 } 
                   if(count ==1){
                   arr[index]=i;
                   index++;
                 } 
        }
        System.out.println(Arrays.toString(arr));
         System.out.println(s);
    }
}
