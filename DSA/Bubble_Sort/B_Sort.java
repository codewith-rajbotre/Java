// import java.util.Scanner;
public class B_Sort{
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        // Scanner sc = new Scanner(System.in);
        int arr[] = {12, 3, 55, 30 , 73, 98};
         for(int i=0 ; i<arr.length ; i++){
               System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");
        for(int i=0 ; i< arr.length ; i++){
            for(int j=0; j < (arr.length-1) ; j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
               }
               
               
            }
        }
      
        for(int i=0 ; i<arr.length ; i++){
                System.out.print(arr[i]+ " ");
        }
    }

}