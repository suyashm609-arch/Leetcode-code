class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;
            for (int j = i; j < nums.size(); j++) {
                sum = sum + nums.get(j);
                if (j - i + 1 >= l && j - i + 1 <= r && sum > 0) {
                    if (sum < ans) {
                        ans = sum;
                    }
                }
            }
        }
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}