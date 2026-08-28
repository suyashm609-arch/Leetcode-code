class Solution {
    public int smallestRangeI(int[] nums, int k) {
       Arrays.sort(nums);
       int a=nums[nums.length-1]-nums[0]-2*k;
       if(a<0)
       return 0;
       return a; 
    }
}