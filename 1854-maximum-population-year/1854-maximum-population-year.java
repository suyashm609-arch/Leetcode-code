class Solution {
    public int maximumPopulation(int[][] logs) {
        int a=0,max=0;
        for(int i=1950;i<=2050;i++){
            int c=0;
            for(int[] x:logs)
            if(x[0]<=i&&i<x[1]) c++;
            if(c>max){
                max=c;
                a=i;
            }
        }
        return a;
    }
}