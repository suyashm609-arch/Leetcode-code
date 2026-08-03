class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for (int i=1;i<num;i++){
            int c=0;
            if(num%i==0){
                c=i;
            }
            sum+=c;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}