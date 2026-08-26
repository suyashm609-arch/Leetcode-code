class Solution {
    public int minMoves(int[] nums) {
       Arrays.sort(nums);
       int a=0;
       for(int i=0;i<nums.length;i++){
        a+=nums[i]-nums[0];
       }      
       return a;  
    }
}