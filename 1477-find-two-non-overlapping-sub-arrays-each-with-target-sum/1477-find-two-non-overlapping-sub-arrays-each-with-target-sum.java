class Solution {
    public int minSumOfLengths(int[] A, int k) {
        int n=A.length;
        int res=n+1, sum=0,i=0;
        int[] a=new int[n + 1];
        Arrays.fill(a,n);
        for (int j=0;j<n;j++) {
            sum+=A[j];
            while(sum>k)
                sum-=A[i++];
            a[j+1]=a[j];
            if (sum==k) {
                res=Math.min(res, j-i+1+a[i]);
                a[j+1]=Math.min(a[j],j-i+1);
            }
        }
        return res==n+1 ? -1 : res;
    }
}