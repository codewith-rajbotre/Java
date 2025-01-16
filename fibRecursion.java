import java.util.Scanner;
public class fibRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements of fibonacci Series we want to Print :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(fibo(i));
        }
        
    }
    static int fibo(int n){
        
        if(n==1 ||n==2){
            return 1;
        }
        return (fibo(n-1)+fibo(n-2));

    }
    
}
