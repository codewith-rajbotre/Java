public class Array2D{
    public static void main(String[] args){
        int arr1[][] ={
            {11, 12, 13},
            {21, 22, 23},
            {31, 32, 33}
        };
            int arr2[][] ={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int add [] [] = new int [3][3];
        for(int i=0 ; i<arr1.length; i++){
            for(int j=0 ; j<arr2.length ; j++){
                add [i] [j] =arr1[i][j] +arr2[i][j];
            }
        }
          for(int i=0 ; i<arr1.length; i++){
            for(int j=0 ; j<arr2.length ; j++){
                System.err.print(add[i][j] +" ");
            }
            System.out.println();
        }
    }
}