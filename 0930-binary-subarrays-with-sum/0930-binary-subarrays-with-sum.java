class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c=0,sum=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int diff=sum-goal;
            if(map.containsKey(diff)){
                c+=map.get(diff);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}