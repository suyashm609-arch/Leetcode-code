class Solution {
    public int mostWordsFound(String[] sentences) {
       int max=0;
       for(String str:sentences)
        max=Math.max(max,str.split(" ").length);
       return max;
    }
}