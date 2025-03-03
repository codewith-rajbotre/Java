
import java.util.Arrays;


public class Strings{
    public static void main(String[] args) {
        String s = "Hello World";
        char ch[] = s.toCharArray();
        for(int i=0 ; i<s.length() ; i++){
             if(ch[i]>65 && ch[i]>90){
                ch[i]= (char) (ch[i]+90);
             }
    
        }
        System.out.println(Arrays.toString(ch));
        
    }
}