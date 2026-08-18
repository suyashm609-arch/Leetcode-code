class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int a=0,n=0,si=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0'&&c<='9')
            n=n*10+c-'0';
            else if(c=='+'){
                a+=si*n;
                n=0;
                si=1;
            }else if(c=='-'){
                a+=n*si;
                n=0;
                si=-1;
            }else if(c=='('){
                st.push(a);
                st.push(si);
                a=0;
                si=1;
            }else if(c==')'){
                a+=si*n;
                n=0;
                a*=st.pop();
                a+=st.pop();
            }    
        }
        return a+si*n;
    }
}