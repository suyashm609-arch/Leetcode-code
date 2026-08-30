class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        for(int i=0;i<t.length();i++){
            if(a<s.length()&&s.charAt(a)==t.charAt(i)){
                a++;
            }
        }
        return a==s.length();
    }
}