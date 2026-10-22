class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, zero = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) zero = i;
        }
        int ans = Integer.MAX_VALUE;
        for (int d = 1; d >= -1; d -= 2) {
            boolean ok = true;
            for (int i = 1; i < n; i++) {
                int a = (zero + (i - 1) * d + n) % n;
                int b = (zero + i * d + n) % n;
                if (nums[a] > nums[b]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                if (d == 1) {
                    ans = Math.min(ans, zero);
                    ans = Math.min(ans, n - zero + 2);
                } else {
                    ans = Math.min(ans, zero + 2);
                    ans = Math.min(ans, n - zero);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}