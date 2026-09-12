class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int x=0;
        for(int a:nums){
            x+=a;
        }
        return x%k;
    }
};