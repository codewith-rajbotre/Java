import java.util.Arrays;
import java.util.List;
class NumberStream{
  public static void main(String[] args) {
      List<Integer> arr = Arrays.asList(56, 34, 8, 34, 1);
      int nums = arr.stream().reduce(0, (a, b) -> a + b); 
      System.out.println(nums);
  }
}