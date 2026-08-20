class Solution {
    public int[] resultArray(int[] nums) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length];
        int x=1,y=1;
        a[0]=nums[0];b[0]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(a[x-1]>b[y-1]){
                a[x++]=nums[i];
            }else {
                b[y++]=nums[i];
            }
        }
        for(int i=0;i<y;i++){
            a[x+i]=b[i];
        }
        return a;
    }
}