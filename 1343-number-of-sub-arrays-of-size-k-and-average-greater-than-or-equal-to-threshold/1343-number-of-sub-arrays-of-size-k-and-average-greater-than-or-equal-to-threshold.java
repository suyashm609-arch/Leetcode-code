class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int sum=0, x=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        if(i-x+1==k){
           if(sum/k>=threshold){
            c++;
           }
            sum-=nums[x];
            x++;
        }
        }
     return c;
    }
}