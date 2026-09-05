class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int a=nums.length;
         int[] min=new int[a];
         min[a-1]=nums[a-1];
         for(int i=a-2;i>=0;i--){
            min[i]=Math.min(nums[i],min[i+1]);
         }
         int max=0;
         for(int i=0;i<a;i++){
            max=Math.max(max,nums[i]);
        if(max-min[i]<=k){
            return i;
        }
           }
        return -1;
    }
}