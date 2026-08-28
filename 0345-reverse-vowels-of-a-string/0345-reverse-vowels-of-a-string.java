class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (!"aeiouAEIOU".contains(a[i] + "")) {
                i++;
            } 
            else if (!"aeiouAEIOU".contains(a[j] + "")) {
                j--;
            } 
            else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}