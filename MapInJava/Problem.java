// Int number[]= {2, 4, 6, 5} Int cubes[]={216, 64, 8, 125, 216,8, 8, 64}...first array madhle number che cubes second array madhe..kiti times repeat zalet te print krayche

import java.util.*;
public class Problem{
    public static void main(String[] args) {
        int[] number = {2,4,6,5};
        int[] cubes = {216,64,8,125,216,8,8,64};
        Map<Integer, Integer>m = new TreeMap<>();
        for(int nums : cubes){
           m.put(nums, m.getOrDefault(nums,0)+1);
        }
        Arrays.sort(number);
        for(int i=0; i< number.length ; i++){
            System.out.println(number[i]+":"+ m.get(number[i]*number[i]*number[i]));
        }
        //System.out.println(m);
    }
}