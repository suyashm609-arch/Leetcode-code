class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] x=new long[k];
        long[] y=new long[k];
        for(int num:nums){
            long[] temp=new long[k];
            int a=num%k;
            temp[a]++;
            for(int i=0;i<k;i++){
                temp[i*a%k]+=y[i];
            }
            for(int i=0;i<k;i++){
                x[i]+=temp[i];
            }
            y=temp;
        }
        return x;
    }
}