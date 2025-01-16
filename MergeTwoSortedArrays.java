import java.util.List;
import java.util.ArrayList;
public class MergeTwoSortedArrays {

     public static List<Integer> MergeArray(int []arr1,int [] arr2){
          int i=0,j=0;
          List<Integer> element = new ArrayList<>();
         while(i<arr1.length && j<arr2.length){
              
            if(arr1[i]<arr2[j]){
                element.add(arr1[i]);
                i++;
            }
            else{
                element.add(arr2[j]);
                j++;
            }
         }
         while(i<arr1.length){
            element.add(arr1[i]);
            i++;
         }
         while(j<arr2.length){
            element.add(arr2[j]);
            j++;
         }
          
            
          return element;
     }
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={2,6,9,10};
        List <Integer>result=MergeArray(arr1,arr2);
        for(int num:result){
            System.out.println(num);
        }
    }

    
}
