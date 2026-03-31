
import java.util.Arrays;

class SecondLargestElement{
    public static void main(String[] args) {
          int []arr = {11, 32, 44, 2, 55, 902, 4};
        
          //Menthod 1 
          //step 1 : Sort the array
          Arrays.sort(arr);

          int largest = arr[arr.length-1];

          System.out.println("Largest element is :"+ largest);
          int secondLargest = 0;
          for(int i=arr.length-1 ; i>=0 ; i--){
               if( largest != arr[i] ){
                    secondLargest = arr[i];
                    break;
               }
          }
          System.out.println("Second Largest Element is :" + secondLargest);
    }
}