class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] a = num1.split("\\+|i");
        String[] b = num2.split("\\+|i");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        int p = Integer.parseInt(b[0]);
        int q = Integer.parseInt(b[1]);
        return (x*p-y*q) + "+" + (x*q+y*p) + "i";
    }
}