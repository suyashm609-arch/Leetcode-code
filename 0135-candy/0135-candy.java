class Solution {
    public int candy(int[] r) {
       int n=r.length,ans=n;
       int u=0;
       int d=0;
       int p=0;
       for(int i=1;i<n;i++){
        if(r[i]>r[i-1]){
            if(d>0) u=0;
            u++;
            p=u;
            d=0;
            ans+=u;
        }else if(r[i]<r[i-1]){
            d++;
            ans+=d;
            if(d<=p) ans--;
        } else{
            u=d=p=0;
        }
       } 
       return ans;
    }
}