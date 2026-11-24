class Solution {
    public int maxLength(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int product = 1;
            int lcm = nums[i];
            int gcd = nums[i];
            for(int j = i; j < nums.length; j++) {
                product *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = lcm(lcm, nums[j]);
                if(product == lcm * gcd) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
    int gcd(int a, int b) {
        if(b == 0)   return a;
        return gcd(b, a % b);
    }
    int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}