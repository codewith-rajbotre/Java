// import java.util.*;
// public class BinarySearch {
//     public static void main(String[] args) {
//         int arr[]={23,23,2,4,7,67,88,65,35,3,67,45,43,0,56,8};
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//               System.out.println("Index : "+i+" Element 3"+arr[i]);
//         }
//         Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the element you want to search :");
//         int  element=sc.nextInt();

//         int a= Arrays.binarySearch(arr,element);
//         System.out.println("Element found at index"+a);
//     }
    
// }
import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {3,2,1,7,5,6,4};

        // Sorting the Given Array
        Arrays.sort(arr);    
        System.out.print("The Given Array is : ");
        
        // Printing the array using loops
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int len = Arrays.binarySearch(arr,33);    // using binarysearch function
        System.out.println("Element is Found at " + (len+1) + " Position." );
    }
}