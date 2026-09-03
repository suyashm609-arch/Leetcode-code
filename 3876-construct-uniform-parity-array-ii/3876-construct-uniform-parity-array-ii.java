class Solution {
    public boolean uniformArray(int[] nums) {
        int min=nums[0];
        boolean odd=false;
        for(int x:nums){
            if(x<min) min=x;
             if(x%2!=0) odd=true;
            }
        return min%2!=0 || !odd;
    }
}