class Solution {
    public boolean sumGame(String s) {
        int a=0,b=0,c=0,n=s.length()/2;
        for(int i=0;i<n;i++)
            if(s.charAt(i)=='?') c++;
            else a+=s.charAt(i)-'0';
        for(int i=n;i<s.length();i++)
            if(s.charAt(i)=='?') c--;
            else b+=s.charAt(i)-'0';
        return c%2!=0 || 2*(a-b)!=-9*c;
    }
}