import java.util.Scanner;
class Recursion{
    public static void main(String[] args) {
        System.out.println("Recursion In java");
        System.out.println("Lets understand recursion by using fibonacci series.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = fib(num);
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
    
            return (fib(n-1)+fib(n-2));
       
           
    }
}