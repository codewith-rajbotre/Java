import java.util.Arrays;
import java.util.List;
class ParallelStream{
    public static void main(String[] args) {
          List<String> words = Arrays.asList("a", "b", "c", "d");

        String result = words.parallelStream()
                             .reduce("", 
                                     (s1, s2) -> s1 + s2, 
                                     (s1, s2) -> s1 + s2);

        System.out.println(result); // abcd (order may vary in parallel)
    }
}