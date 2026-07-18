class Solution {
    public int findGCD(int[] nums) {
       int a=Integer.MAX_VALUE;
       int b=0;
       for(int x:nums){
       a=Math.min(a,x);
       b=Math.max(b,x);
    }
    while(b%a!=0){
        int temp=b%a;
        b=a;
        a=temp;
    }
    return a;
  }
}