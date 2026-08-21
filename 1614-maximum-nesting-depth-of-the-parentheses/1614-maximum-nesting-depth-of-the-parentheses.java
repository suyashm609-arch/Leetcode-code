class Solution {
    public int maxDepth(String s) {
        int d=0;
        int a=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                d++;
                if(d>a)
                a=d;
            }
            if(c==')')
            d--;
        }
        return a;
    }
}