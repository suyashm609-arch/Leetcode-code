class Solution {
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        int c=0,lastEnd=-1;
        for (int i= 0;i<2*n-1;i++) {
            int l=i/2,r=l+i%2;
            while (l>= 0&&r<n&&s.charAt(l)==s.charAt(r)) {
                if (r-l+1>=k&&l>lastEnd) {
                    c++;
                    lastEnd=r;
                    break;
                }
                l--;
                r++;
            }
        }
        return c;
    }
}