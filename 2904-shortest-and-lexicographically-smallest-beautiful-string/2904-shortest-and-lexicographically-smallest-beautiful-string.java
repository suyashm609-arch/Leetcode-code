class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int one=0;
        int n=s.length();
        String ans="";
        int start=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='1'){
                one++;
            }
            while(one>k){
                if(s.charAt(start)=='1'){
                    one--;
                }
                start++;
            }
            while (one == k && s.charAt(start) == '0') {
                start++;
            }
            if (one == k) {
                String cur = s.substring(start, i+1);
                if (ans.isEmpty() || ans.length()>cur.length() || ans.length() == cur.length() && cur.compareTo(ans) < 0) {
                    ans = cur;
        }
    }
}
return ans;
    }
}