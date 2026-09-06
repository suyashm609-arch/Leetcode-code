class Solution {
    public int numDistinct(String s, String t) {
        int[] a=new int[t.length()+1];
        a[0]=1;
        for(char c:s.toCharArray()){
            for(int i=t.length()-1;i>=0;i--){
                if(c==t.charAt(i)){
                    a[i+1]+=a[i];
                }
            }
        }
        return a[t.length()];
    }
}