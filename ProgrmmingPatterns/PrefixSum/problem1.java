class problem1 {
    public static void main(String[] args) {
        int[] nums ={3, 3,2,3,3};
       int ans = pivotIndex(nums);
       System.err.println(ans);
    }
    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        
        int leftTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal - nums[i];
            if (rightTotal == leftTotal) {
                return i;
            }
            leftTotal += nums[i];
        }

        return -1;        
    }
}