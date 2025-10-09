import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Example{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(23);
        l.add(34);
        l.add(9);
        System.out.println(l);

        List<Integer>l1 = l.stream().map(a->a*2).toList();
        System.out.println(l1);

        List<Integer> l2 = l1.stream().map(a->a/2).toList();
        System.out.println(l2);

        List<Integer> l3 = l1.stream().filter(a-> a>3).toList();
        System.out.println("l3"+l3);

        List<String> ls = Arrays.asList("Hello", "World", "Here");
        List<String> ls1 = ls.stream().filter(a->a.length()>4).toList();
        System.out.println("ls1: "+ls1);
        List<String> lsUpperCase =  ls.stream().map(String::toUpperCase).toList();
        System.out.println(ls);
        System.out.println(lsUpperCase);
    }
}