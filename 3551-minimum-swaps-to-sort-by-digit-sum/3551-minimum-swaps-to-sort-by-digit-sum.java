class Solution {
    public int minSwaps(int[] nums) {
      int n=nums.length;
      Integer[] x=new Integer[n];
      for(int i=0;i<n;i++)  x[i]=nums[i]; 
      Arrays.sort(x,(a,b) -> {
        int sa=digitSum(a),sb=digitSum(b);
        if(sa!=sb) return sa-sb;
        return a-b;});
        Map<Integer, Integer> pos=new HashMap<>();
        for(int i=0;i<n;i++) pos.put(x[i],i);
        boolean[] y=new boolean[n];
        int z=0;
        for(int i=0;i<n;i++){
            if(!y[i]){
                z++;
                int j=i;
                while(!y[j]){
                    y[j]=true;
                    j=pos.get(nums[j]);
                }
            }
        } 
        return n-z;
    }
    private int digitSum(int x){
        int s=0;
        while(x>0){
            s+=x%10;
            x/=10;
        }
        return s;
    }
}