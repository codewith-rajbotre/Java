import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int i;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter The element we want to search in the Array : ");
        int element=sc.nextInt();
        int arr[]={12,32,2,45,66,77,22,72};

        linearSearch(arr,element);
        // System.out.println("Enter the Elements of the Array");
        
    }
    public static void linearSearch(int arr[],int element){
        int i;
        for( i=0;i<(arr.length);i++){
            if(arr[i]==element){
                System.out.println("found");
                return;
            }
        }
       System.out.println("Not found");
    }
}
