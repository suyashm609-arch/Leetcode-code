class Solution {
    public String reverseParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        for (char c:s.toCharArray()) {
            if (c==')') {
                int i=ans.length()-1;
                while (ans.charAt(i)!='(') {
                    i--;
                }
                String part=ans.substring(i + 1);
                ans.delete(i,ans.length());
                ans.append(new StringBuilder(part).reverse());
            }  else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}