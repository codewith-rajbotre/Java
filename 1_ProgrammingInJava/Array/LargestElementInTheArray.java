import java.util.Arrays;
import java.util.Scanner;
class LargestElementInTheArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
            "Enter the size of the array : "
        );
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in the Array : ");
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
           
        //Largest Element in the array Logic 1

        // Step1: Sort the array
        Arrays.sort(arr);
        //We get largest element at the last
        System.out.println("Largest Element in the array : "+arr[n-1]);

        //Logic 2
        int max = arr[0];
        for(int i=1 ; i< n; i++){
             if(arr[i]> max){
                max = arr[i];
             }
        }
        System.out.println("Largest Element : " + max);

       



    }
}