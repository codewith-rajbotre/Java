import java.util.Scanner;
public class FibExample{

    public static void fibonacciNumber(int number){
         int a=0, b=1, c=a+b;
        switch (number) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(a);
                System.out.println(b);
                break;
            default:
                System.out.println(a);
                System.out.println(b);
                for(int i=2 ; i< number ; i++){
                    int temp = a;
                    a = b;
                    b = b + temp ;
                    System.out.println(a+b);
                }   break;
        }
        
    }


    public static void main(String[] args) {
        System.out.println("We are calling the fibonacci Series Function : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many fibonacci Numbers you have to print : ");
        int number = sc.nextInt();
        fibonacciNumber(number);
    }
}