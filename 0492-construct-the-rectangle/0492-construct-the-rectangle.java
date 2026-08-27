class Solution {
    public int[] constructRectangle(int area) {
        int a=0;
        int b=0;
       for(int i=1;i<=area;i++){
        if(area%i==0){
         a=area/i;
            if(a>=i){
                b=i;
            }
        }
       } 
       return new int[]{area/b,b};
    }
}