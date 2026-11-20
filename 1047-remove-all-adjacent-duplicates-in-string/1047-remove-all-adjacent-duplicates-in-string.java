class Solution {
    public String removeDuplicates(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
             if (ans.length()>0 && ans.charAt(ans.length()-1)==s.charAt(i)){
                ans=ans.substring(0,ans.length()-1);
            } else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}