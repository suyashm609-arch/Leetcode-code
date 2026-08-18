class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums1)
        s.add(i);
        int[] a=new int[s.size()];
        int k=0;
        for(int j:nums2){
            if(s.contains(j)){
                a[k++]=j;
                s.remove(j);
            }
        }
        return Arrays.copyOf(a,k);
    }
}