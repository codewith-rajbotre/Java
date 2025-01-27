public class Reverse_Number {
    public static void main(String[] args) {
        int num =234221;
        int temp  = num, rem;
        int rev_Num = 0;
        while (temp !=0) { 
            rem = temp %10;
            rev_Num = rev_Num*10 + rem ;
            temp = temp /10; 
        }
        System.out.println("Number : "+num+"   Reverse Number :"+rev_Num);
         
    }

}
