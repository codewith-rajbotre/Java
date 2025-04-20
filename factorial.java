public class factorial{

    public static void main(String[] args)
    {
           System.out.println(factorials(4));
    }
    public static int factorials(int num){
          if(num==0 || num==1){
            return 1 ;
          }
          else{
            return num * factorials(num -1);
          }
    }
}