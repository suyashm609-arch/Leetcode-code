class Solution {
    public int numberOfSets(int n, int k) {
        final long MOD = 1_000_000_007L;
        long[] a=new long[n];
        long[] prefixSums = new long[n + 1];
        for (int j = 0; j < n; j++) {
            a[j] = 1;
            prefixSums[j + 1] = (prefixSums[j] + a[j]) % MOD;
        }
        for (int i = 0; i < k; i++) {
            a[0] = 0;
            for (int j = 1; j < n; j++) {
                a[j] = (a[j - 1] + prefixSums[j]) % MOD;
            }
            prefixSums[0] = 0;
            for (int j = 0; j < n; j++) {
                prefixSums[j + 1] = (prefixSums[j] + a[j]) % MOD;
            }
        }
        return (int) a[n - 1];
    }
}