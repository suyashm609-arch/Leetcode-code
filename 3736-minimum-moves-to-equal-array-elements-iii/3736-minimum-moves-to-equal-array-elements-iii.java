class Solution {
    public int minMoves(int[] nums) {
        int x=nums[0];
        for(int i=0;i<nums.length;i++){
              if(nums[i]>x)  x=nums[i];
        }
        int c=0;
         for(int i=0;i<nums.length;i++){
            c+=x-nums[i];
         }
         return c;
    }
}