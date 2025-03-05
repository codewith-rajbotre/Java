
import java.util.*;

public class Class {

    Class() {
        System.out.println("In Constructor Body");
    }

    public int add(int... nums) {
      int sum =0;
        for(int element : nums){
           sum = sum+element;
        }
        return sum;
    }

    public int sub(int... nums) {
       int sub =nums[0];
       
       for(int i=1; i<nums.length ;i++){
        sub = sub-nums[i];
       }
        return sub;
    }

    public int mul(int... nums) {
      int mul =1;
      for(int element : nums){
        mul = mul * element;
      }
        return mul;
    }

    public double div(double... nums) {
        double div =nums[0];
        for(int i=1; i<nums.length ; i++){
            div = div /nums[i];
        }
        return div;
    }

    public int mod(int num1, int num2) {
        return (num1 % num2);
    }

    public static void main(String[] args) {
        Class a = new Class();
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition : 1 \n Substraction : 2 \n Multiplication : 3 \n Division : 4");
        System.out.println("Enter the Option Number You Want to perform : ");
        int N = sc.nextInt();
       

        switch (N) {
            case 1:
                System.out.printf("Addition : %d \n", a.add(1,2,3,4,5));
                break;
            case 2:
                 System.out.printf("Substraction : %d \n",a.sub(100,1,2,3,4,5));
                break;
            case 3:
               System.out.printf("Multiplication : %d \n",a.mul(1,2,3,4,5));
                break;
            case 4:
                System.out.printf("Division : %f \n",a.div(510,5,2));
                break;
            default:
              System.out.printf("Invalid Case");
                
        }
        // System.out.printf("Addition : %d \n",a.add(10,9 ));
        // System.out.printf("Substraction : %d \n",a.sub(10, 9));
        // System.out.printf("Multiplication : %d \n",a.mul(10, 9));
        // System.out.printf("Division : %f \n",a.div(11,2));
        // System.out.printf("Modulo : %d \n",a.mod(10, 9));

    }
}
