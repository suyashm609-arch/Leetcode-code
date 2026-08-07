class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            while(n>0){
                int d=n%10;
                if(d==0 || i%d!=0)
                break;
                n/=10;
            }
            if(n==0) 
            ans.add(i);
        }
        return ans;
    }
}