class Solution {
    public int longestSubarray(int[] nums) {
        int a=0,b=0,c=0;
        for(int x:nums){
            if(x==1){
                c++;
            }else{
                b=c;
                c=0;
            }
        a=Math.max(a,b+c);
        }
        return Math.min(a,nums.length-1);
    }
}