
import java.util.Arrays;

public class CountWords{
    public static void main(String[] args) {
         String s = "The Game of Thrones";
         String arr[] = s.split(" ");
         System.out.println(Arrays.toString(arr));
         System.out.println(arr.length);
         
         
         char ch[] = s.toCharArray();
         int count =1 ;
         for(int i=0 ; i<ch.length; i++){
            if(ch[i] == ' '){
                count++;
            }
         }
         System.out.println(count);
    }
}