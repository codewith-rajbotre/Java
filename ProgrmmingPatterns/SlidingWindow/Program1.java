class Program1 {
    public static void main(String[] args) {
        int[] nums ={11,23,2,43,32,23,1,43};
        int k=  3;
        System.out.println(findMaxAverage(nums, k));
    }
    public static  double findMaxAverage(int[] nums, int k) {
       double sum=0;
   
       int n=nums.length;
       for(int i=0;i<k;i++)
       {
        sum+=nums[i];
       } 
  
    double mxlen=sum/k;
       int l=0;
       int r=k-1;
       while(r<n-1)
       {
        sum-=nums[l];
        l++;
        r++;
        sum+=nums[r];
        mxlen=Math.max(mxlen,sum/k);
       }
       return mxlen;
    }
}