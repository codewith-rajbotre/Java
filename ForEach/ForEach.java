import java.util.Arrays;
import java.util.List;

public class ForEach{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,612,9,11);
        //System.out.println(nums);
//Lambda Expression


nums.forEach(n->  System.out.println(n));





//Full Expression

    //    Consumer<Integer> con =new Consumer<Integer>() {
    //         public void accept(Integer n){
    //             System.out.println(n);
    //         }
    //    };
    //    nums.forEach(con);

    }
    
}