class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int[] nums,int k){
        int a=0,oddCount=0,count=0;
        for (int i = 0;i<nums.length;i++) {
          if(nums[i]%2==1){
            oddCount++;
          }
          while(oddCount>k){
            if(nums[a]%2==1){
                oddCount--;
            }
               a++;
          }
          count+=i-a+1;
        }
        return count;
    }
}