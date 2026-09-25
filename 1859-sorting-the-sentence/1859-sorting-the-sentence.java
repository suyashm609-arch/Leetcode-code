class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        String b="";
        for (int i=1;i<=a.length;i++)
            for (String x:a)
                if (x.endsWith(""+i))
                    b+=x.substring(0,x.length()-1)+" ";
        return b.trim();
    }
}