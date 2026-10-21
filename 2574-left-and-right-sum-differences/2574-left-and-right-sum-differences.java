class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0,right=0;
        int n=nums.length;
         int []a=new int[n];
         for(int x:nums) right+=x;
         for(int i=0;i<n;i++){
            right-=nums[i];
         a[i]=Math.abs(right-left);
         left+=nums[i];
         }
          return a;
    }
}