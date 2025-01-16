import java.util.*;
public class IntersectionOfArrays {
   public static List<Integer> toFindIntersection(int arr1[],int arr2[]){
      List<Integer> elements =new ArrayList<>();                
      int i=0;
      int j=0; 
      while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
             i++;
        }
        else if(arr2[j]<arr1[i]){
                 j++;
        }
        else{
            elements.add(arr1[i]);
            i++;
            j++;
        }
    }
  return elements;
 }
 public static void main(String[] args) {
    int arr1[]={1,2,3};
    int arr2[]={2,2};
    List<Integer> ListPrint=toFindIntersection(arr1,arr2);
     for(int num:ListPrint){
        System.out.println(num);
     }
}
}
