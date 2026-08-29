class Solution {
    public int reverseBits(int n) {
        int a=0;
        for(int i=0;i<32;i++){
            int k=n%2;
            a=a*2+k;
            n=n/2;
        }
        return a;
    }
}