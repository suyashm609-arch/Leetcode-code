class Solution {
    public boolean isValid(String s) {
        java.util.Stack<Character> st = new java.util.Stack<>();
         for(char c:s.toCharArray()){
            if(c=='(')st.push(')');
            else if(c=='{')st.push('}');
            else if(c=='[')st.push(']');
            else if(st.isEmpty() || st.pop() !=c )
            return false ;
         }
         return st.isEmpty();   
    }        
}