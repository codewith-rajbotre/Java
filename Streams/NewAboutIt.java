import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class NewAboutIt{
    public static void main(String[] args) {
        System.out.println("Map | Filter | Reduce");
        List<Integer> list1 = Arrays.asList(11, 22, 33, 44, 55, 66, 77);
        System.out.println("List Before any Operations: "+list1);

        List<Integer> list2 = list1.stream().map(a->a*2).collect(Collectors.toList());
        System.out.println("Double of List Using Map : "+list2);

        int add = list1.stream().reduce(2,(a,b)->{a=a+b; return a;});
        System.out.println("After adding add the values and starting value is 2 : Reduce Function : "+add);

        List<Integer> list3 = list1.stream().filter(a->a%3!=0).collect(Collectors.toList());
        System.out.println("Filter function: "+ list3);
        


    }
}