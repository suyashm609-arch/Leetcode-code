class Solution {
    public String convertToBase7(int num) {
        if (num == 0)
            return "0";
        String rev = "";
        int rem;
        boolean neg = num < 0;
        long n = num;
        if (n < 0)
            n = -n;
        while (n != 0) {
            rem = (int)(n % 7);
            rev = rem + rev;
            n = n / 7;
        }
        if (neg)
            rev = "-" + rev;
        return rev;
    }
}