class Solution {
    public int sortPermutation(int[] nums) {
        int a=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)
            a=a&nums[i];
        }
        return Math.max(a,0);
    }
}