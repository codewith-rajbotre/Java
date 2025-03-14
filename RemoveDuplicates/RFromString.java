import java.util.*;
public class RFromString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");

        Strings s = sc.next();

        Set<Character>a = new HashSet<>();//To add only one time
        StringBuilder sa = new StringBuilder();
       
        for(int i=0; i<s.length() ; i++){
                if(a.add(s.charAt(i))){
                    sa.append(s.charAt(i));
                }
        }
         System.out.println(sa);
        s= sa.toString();

        System.out.println(s);

    }

}