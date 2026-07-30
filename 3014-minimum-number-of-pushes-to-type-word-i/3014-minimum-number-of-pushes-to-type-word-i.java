class Solution {
    public int minimumPushes(String word) {
        int x=0;
      for(int i=0;i<word.length();i++){
       x+=(i/8)+1;
      }
      return x;
    }
}