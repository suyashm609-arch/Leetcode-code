class Solution {
public:
    int countDigits(int num) {
        int c=0,a=num;
        while(a>0){
            int x=a%10;
            if(num%x==0){
                c++;
            }
            a=a/10;
        }
        return c;
    }
};