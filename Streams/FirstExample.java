import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class FirstExample{
    public static void main(String[] args) {
          List<Integer> l = Arrays.asList(11,76,54,93,32);

        // Stream pipeline
        List<Integer> result = l.stream()
                                   .filter(a->a*2!=0)
                                   .sorted()
                                   .collect(Collectors.toList()); 
        System.out.println(result);
        
    }
}