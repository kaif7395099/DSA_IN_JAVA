class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n= matrix[0].length;
        int i=0 ,j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j] > target) j--;
            else if(matrix[i][j]<target) i++;
            else return true;
        }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j] == target) return true;
        //     }
        // }
        return false;
    }
}