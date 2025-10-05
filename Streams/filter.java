
import java.util.List;
import java.util.stream.Collectors;
public class filter{
    public static void main(String[] args){
        System.out.println("Filter in Java");

        List<Integer> l1 = List.of(12,3,14,5,22,23);
        List<Integer> l2 = l1.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(l2);
       l1.stream().filter(a->a%2==0).forEach(System.out::println);

    }
}