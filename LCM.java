import java.util.Scanner;


public class LCM {
    public static void main(String [] args){
        Scanner lc=new Scanner(System.in);
        int i;
        System.out.println("Enter Two numbers Whose LCM You want to Find:");
        int num1=lc.nextInt();
        int num2=lc.nextInt();
        for( i=1;i<=num1*num2;i++){
            if(i%num1==0 && i%num2==0){
                
                break;
            }
        }
        System.out.println("LCM :"+i);
    }
    
}
