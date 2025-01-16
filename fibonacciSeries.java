import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String [] args){
                 System.out.println("Enter How many Numbers of fibonacci series You want to print :");
                 Scanner sc=new Scanner(System.in);
                 int n=sc.nextInt();
                 int a=-1,b=1,c;
                 for(int i=1;i<=n;i++){
                    c=a+b;
                    System.out.println(c);
                    a=b;
                    b=c;
                 }



                }
}
