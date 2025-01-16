import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i;
        for ( i=2;i>1;i++){
            while(num%i==0){
                System.out.println(i);
                num=num/i;
            }
        }
    }
    
}
