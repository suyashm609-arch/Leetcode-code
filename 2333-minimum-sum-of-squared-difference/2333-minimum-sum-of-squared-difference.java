class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;         
        int MAX = 100000;
        long[] count = new long[MAX + 1]; 
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            count[diff]++;
        }
        for (int d = MAX; d >= 1 && k > 0; d--) {
            long take = Math.min(count[d], k); 
            count[d] -= take;                  
            count[d - 1] += take;             
            k -= take;                         
        }
        long result = 0;
        for (int d = 1; d <= MAX; d++) {
            result += count[d] * (long) d * d;
        }
        return result;
    }
}