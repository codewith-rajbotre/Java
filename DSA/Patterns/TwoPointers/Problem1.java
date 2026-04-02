class Problem1{
    public static void main(String[] args) {
        int[] arr1 = {12, 42, 11, 42, 4, 44};
        int sum = 16;
        boolean ans = findElements(arr1, sum);
        System.out.println(ans);
    }
    //1. Simple Way
    // public static boolean findElements(int[] arr, int sum){
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i; j< arr.length; j++){
    //             if(sum == arr[i]+ arr[j] ){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2. Two Pointers Pattern

    private static boolean findElements(int[] arr, int sum){
           int left = 0, right = arr.length-1;
           for(int i=0 ; i< arr.length; i++){
               if(arr[left]+arr[right]== sum){
                return true;
               }
               else if (sum > arr[left]+arr[right]) {
                  left ++;   
               }
               else{
                right --;
               }
           } 
           return false;
    }
}