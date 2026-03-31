import java.util.Arrays;
class Problem1{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        prefixSumArray(arr);
    }
    public static void prefixSumArray(int[] arr){
         int[] prefixSumArr = new int[arr.length];
         prefixSumArr[0]= arr[0];
         for(int i=1; i<arr.length; i++){
               prefixSumArr[i]= prefixSumArr[i-1]+ arr[i];
         }

         System.out.println(Arrays.toString(prefixSumArr));
    }
}