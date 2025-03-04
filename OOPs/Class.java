public class Class{

    Class(){
         System.out.println("In Constructor Body");
    }
    public int add(int num1, int num2){
        return (num1+num2);
    }
      public int sub(int num1, int num2){
        return (num1-num2);
    }
      public int mul(int num1, int num2){
        return (num1*num2);
    }
      public double div(double num1, double num2){
        return (num1/num2);
    }
     public int mod(int num1, int num2){
        return (num1%num2);
    }

    public static void main(String[] args) {
        Class a = new Class();
        System.out.printf("Addition : %d \n",a.add(10,9 ));
        System.out.printf("Substraction : %d \n",a.sub(10, 9));
        System.out.printf("Multiplication : %d \n",a.mul(10, 9));
        System.out.printf("Division : %f \n",a.div(11,2));
        System.out.printf("Modulo : %d \n",a.mod(10, 9));


    }
}