class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            for(int j=1;j<matrix[0].length;j++)
                min=Math.min(min,matrix[i][j]);
                for(int j=0;j<matrix[0].length;j++){
                    boolean max=true;
                    for(int k=0;k<matrix.length;k++)
                        if(matrix[k][j]>min) max=false;
                        if(max) a.add(min);
                    }
            }
        return a;
    }
}