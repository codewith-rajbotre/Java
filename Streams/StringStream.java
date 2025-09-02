import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class StringStream{
    public static void main(String[] args) {
        List<String> s= Arrays.asList("Hello", "and", "what", "Goes", "well");
        List<String> sOperations = s.stream()
                                    .filter(n->n.startsWith("w"))
                                    .collect(Collectors.toList());
        System.out.println(sOperations);
    }
}