public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
           int i=0;
    int y=matrix[0].length;
    int j=y*matrix.length-1;
    while(i<=j){
        int mid=(i+j)/2;
        if(matrix[mid/y][mid%y]==target){
            return true;
        }else if(matrix[mid/y][mid%y]<target){
            i=mid+1;
        }else {
            j=mid-1;
        }
    }
    return false; 
    }
}