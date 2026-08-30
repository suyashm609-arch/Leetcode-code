class Solution {
    public boolean arrayStringsAreEqual(String[] S1, String[] S2) {
        String a="";
        String b="";
        for(int i=0;i<S1.length;i++){
            a+=S1[i];
        }
        for(int i=0;i<S2.length;i++){
            b+=S2[i];
        }
        return a.equals(b);
    }
}