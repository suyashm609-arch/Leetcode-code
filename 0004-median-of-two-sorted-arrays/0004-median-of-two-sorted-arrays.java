class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=nums1.length+nums2.length;
        int[] nums=new int[x];
        for(int i=0;i<nums1.length;i++){
            nums[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            nums[nums1.length+i]=nums2[i];
        }
        Arrays.sort(nums);
        if(x%2==1){
            return nums[x/2];
        }
        return (nums[x/2-1]+nums[x/2])/2.0;
    }
}