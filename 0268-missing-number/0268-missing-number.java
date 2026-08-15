class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long sum = n*(n+1)/2;
        long arraysum = 0;
        for(int ele : nums){
            arraysum += ele;
        }
        return (int)(sum - arraysum);
    }
}