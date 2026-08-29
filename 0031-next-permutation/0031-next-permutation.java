class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
    // Pehla decreasing element find karna hai
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
    // Usse bada element find karna hai 
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i])
                j--;
      // swap karna hai
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
     //  Remaining part reverse karna hai
        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}