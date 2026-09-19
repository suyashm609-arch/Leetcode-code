class Solution {
    public int alternatingSum(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                a+=nums[i];
            }
            else { 
            a-=nums[i];
        }
    } 
        return a;
    }
}