public class StringPalindrome{
    public static void main(String[] args){
        String s1 = "ABAB";
        boolean res = isPalindrome(s1);
        if (res) {
            System.out.println( s1 + "is a palindrome.");
        } else {
            System.out.println( s1 + " is not a palindrome.");
        }
        
    }
      public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
}