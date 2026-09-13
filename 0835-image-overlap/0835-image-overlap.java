class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int maxCount=0;
        for(int i=1-n;i<n;i++){
            for(int j=1-n;j<n;j++){
                int c=0;
                for(int x=0;x<n;x++){
                    for(int y=0;y<n;y++){
                        int a=x+i;
                        int b=y+j;
                        if(a>=0&&a<n){
                            if(b>=0&&b<n)
                        if(img1[a][b]==1&&img2[x][y]==1){
                        ++c;
                    }
                      }
                }
             }
                maxCount=Math.max(maxCount,c);
            }
        }
        return maxCount;
    }
}