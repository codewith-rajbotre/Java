public class ReverseString{
    public static void main(String[] args) {
        String s = "ABABA";
        s.toLowerCase();
        String reverse ="";
        for(int i= (s.length()-1); i>=0 ; i--){
            reverse = reverse + s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}