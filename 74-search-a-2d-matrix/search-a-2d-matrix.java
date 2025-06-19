class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m =matrix.length;
        int n=matrix[0].length;
        int i =0;
        int  j=n-1;
        while(i<m && j>=0){
            int current=matrix[i][j];
            if (current==target){
                return true;
            }
            else if(current>target){
                j--;
            }
            else{
                i++;
            }

        }
        return false;
        
    }
}