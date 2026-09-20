class Solution {
    public int beautySum(String s) {
             int a=0;
        for(int i=0;i<s.length();i++){
            int[] x=new int[26];
            for(int j=i;j<s.length();j++){
                x[s.charAt(j)-'a']++;
                int max=0,min=s.length();
                for(int y:x){
                    if(y>0){
                       max=Math.max(max,y);
                       min=Math.min(min,y);
                    }
                }
                a+=max-min;
            }
        }
        return a;
    }
}