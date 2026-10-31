class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] a, int target) {
        find(a, target, 0, new ArrayList<>());
        return ans;
    }
    void find(int[] a, int target, int i, List<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0 || i == a.length) return;
        temp.add(a[i]);
        find(a, target - a[i], i, temp);
        temp.remove(temp.size() - 1);
        find(a, target, i + 1, temp);
    }
}