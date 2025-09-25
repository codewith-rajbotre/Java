public class ReverseUsingRecursion{
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseStringFunction(str));

    }
    public  static String reverseStringFunction(String str){
       
        if(str.isEmpty()){
            return str;
        }
        else{

        }
        return  (reverseStringFunction(str.substring(1)))+str.charAt(0);

    }
}