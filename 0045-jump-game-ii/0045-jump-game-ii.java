class Solution {
    public int jump(int[] nums) {
        int x=0,y=0,z=0;
        for(int i=0;i<nums.length-1;i++){
            z=Math.max(z,i+nums[i]);
            if(i==y){
                x++;
                y=z;
            }
        }
        return x;
    }
}