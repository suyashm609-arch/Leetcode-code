class Solution {
    public boolean canConstruct(String S1, String S2) {
      int[] a=new int[256];
      for(int i=0;i<S2.length();i++){
        a[S2.charAt(i)]++;
      }
        for(int i=0;i<S1.length();i++){
        a[S1.charAt(i)]--;
         if(a[S1.charAt(i)]<0) {
                return false;
        }
     }
     return true;
    }
}