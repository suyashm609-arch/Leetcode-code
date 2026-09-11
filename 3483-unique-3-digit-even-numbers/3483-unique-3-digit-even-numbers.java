class Solution {
    public int totalNumbers(int[] nums) {
     int c=0;
     boolean[] used=new boolean[1000];
     for(int i=0;i<nums.length;i++){
        if(nums[i]==0)
            continue;
        for(int j=0;j<nums.length;j++){
            if(j==i)
            continue;
        for(int k=0;k<nums.length;k++){
            if(k==i || k==j)
                continue;
                if(nums[k]%2==0){
                int num = nums[i] * 100 + nums[j] * 10 + nums[k];
                        if(!used[num]) {
                            used[num] = true;
                            c++;
          } 
        }
         }
      }
 }
     return c;
    }
}