import java.util.Scanner;

public class sumofODDnumbers{
    public static void main(String[] args) {
               System.out.println("Enter How many ODD numbers we wanna to Print :");
              Scanner sc=new Scanner(System.in);
              int sum =0;
              int n=sc.nextInt();
              for(int i=1;i<=n;i++){
                int c=i*2-1;
                   System.out.println("NUMBER :"+c);
                   sum+=c;
                   
              }
              System.out.println("Sum of " + n +" odd numbers is "+sum);
    }
}