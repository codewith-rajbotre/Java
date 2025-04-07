import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        isPalindrome(S);
    }
    public static void isPalindrome(String s){
             char[] ch = s.toCharArray();
             char left = ch[0];
             char right = ch[ch.length-1];
             while(left != right){
               if(left !=right){
                      System.out.println("Not Palindrome");
                      break;
               }
               
            else{
                    left++;
                    right --;
                    
                    continue;
                }
             }
    }
}