class Solution {
    public int countSubstrings(String s) {
        int c=0,n=s.length();
        boolean[][] a=new boolean[n][n];
        for(int i=n-1;i>=0;i--){
           for(int j=i;j<n;j++){
            if(s.charAt(i)==s.charAt(j)&&(j-i<=2 || a[i+1][j-1])){
                a[i][j]=true;
                c++;
            }
           }
        }
        return c;
    }
}