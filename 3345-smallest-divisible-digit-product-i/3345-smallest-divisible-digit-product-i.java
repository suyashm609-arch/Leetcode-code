class Solution {
    public int smallestNumber(int n, int t) {
      int smallest=n;
      for(int i=n;i<=(n+10);i++){
        int p=1,c=i;
        while(c!=0){
            int temp=c%10;
            p*=temp;
            c/=10;
        }
        if(p%t==0){
            smallest=p;
            return i;
        }
      }
        return n;
       }
    }
