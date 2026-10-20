class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int k = 1; k <= n / k; k++) {
            if (n % k == 0) {
                if (check(nums, k)) ans += k;
                int x = n / k;
                if (x != k && check(nums, x)) ans += x;
            }
        }
        return ans;
    }
    boolean check(int[] a, int k) {
        int n = a.length, prev = 0;
        for (int s = 0; s < n; s += k) {
            int min = a[s], max = a[s], drop = 0;
            for (int i = s; i < s + k; i++) {
                min = Math.min(min, a[i]);
                max = Math.max(max, a[i]);
                if (a[i] > a[s + (i + 1 - s) % k]) {
                    drop++;
                }
            }
            if (drop > 1 || (s > 0 && prev > min))
                return false;
            prev = max;
        }
        return true;
    }
}