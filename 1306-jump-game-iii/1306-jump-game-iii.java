class Solution {
    public boolean canReach(int[] arr, int i) {
        if (i<0 || i>=arr.length || arr[i]==-1) return false;
        if (arr[i]==0) return true;
        int x=arr[i];
        arr[i]=-1;
        return canReach(arr, i + x) || canReach(arr, i - x);
    }
}