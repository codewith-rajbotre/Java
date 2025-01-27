import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args) {
        // int Number =1212;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int Number = sc.nextInt();
       
       

        int temp = Number;
        int revNum =0,rem;
        while (temp !=0){
            rem = temp%10;
            revNum = revNum*10+rem;
            temp = temp/10;
        }
        if(Number == revNum){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Non-Palindrome Number");
        }

        
    }
}




