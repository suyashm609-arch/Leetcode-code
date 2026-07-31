class Solution {
    public int hammingWeight(int n) {
       int r=0;
       for(int i=0;i<32;i++){
        if(((n>>i)&1)==1){
            r+=1;
        }
       } 
       return r;
    }
}