class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0,max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[min])
            min=i;
            if(nums[i]>nums[max])
            max=i;
        }
        int x=Math.min(min,max);
        int y=Math.max(min,max);
        int a=y+1;
        a=Math.min(a,n-x);
        a=Math.min(a,x+1+n-y);
         return a;
    }
}