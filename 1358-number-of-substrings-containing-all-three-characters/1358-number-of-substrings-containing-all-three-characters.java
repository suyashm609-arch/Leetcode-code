class Solution {
    public int numberOfSubstrings(String s) {
        int x=-1,y=-1,z=-1,a=0;
        for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='a'){
            x=i;
       }
            if(s.charAt(i)=='b'){
            y=i;
            }
            if(s.charAt(i)=='c'){
            z=i;
            }
            a+=Math.min(x,Math.min(y,z))+1;
        }
        return a;
    }
}