class Problem1{
    public static void main(String[] args) {
        System.out.println("Sliding Window");
        int[] arr = {1, 1, 4, 6, 10, 1, 11};
        int sum = 12;
        int size = 3;
        slidingWindow(arr, sum, size);

    }
    public static void slidingWindow(int[] arr, int sum, int size){
          int currSum = 0;

          for(int i=0 ; i<size ; i++){
              currSum = currSum + arr[i];
          }
                if(sum == currSum){
                    System.out.println("The elements found");
                }  
          for(int i=size ; i< arr.length ; i++){ 
                currSum = currSum + arr[i] ;
                currSum = currSum - arr[i-size];
                if(sum == currSum ){
                    System.out.println("the elements found");
                }
              
          }
            if(sum != currSum){
                    System.out.println("Element not found");
                }

    }
}