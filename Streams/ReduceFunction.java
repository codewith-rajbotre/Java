import java.util.Arrays;
import java.util.List;
class ReduceFunction{
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,4,3,5,2);
        
        //Sum of all elements
        int sum = l.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        
        //product of all elements
        int product = l.stream().reduce(1,(a,b)->a*b);
        System.out.println(product);

        //String Concatenation Using Streams

        List<String> s = Arrays.asList("Hello", "I", "am", "here.");
        String st = s.stream().reduce("",(n,m)->n+" "+m);
        System.out.println(st);
    }
}