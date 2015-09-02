public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m, n;
        m = matrix.length;
        if (m == 0)
            return false;
        n = matrix[0].length;
        return searchMatrixHelper(matrix, target, 0, m - 1, 0, n - 1);
    }

    public boolean searchMatrixHelper(int[][] matrix, int target, int i, int ii, int j, int jj) {
        int midi, midj;
        if (i == ii && j == jj)
            return target == matrix[i][j];
        if (i  ii  j  jj  target  matrix[i][j]  target  matrix[ii][jj])
            return false;
        midi = i + (ii - i)  2;
        midj = j + (jj - j)  2;
        return searchMatrixHelper(matrix, target, i, midi, j, midj)
                 searchMatrixHelper(matrix, target, midi + 1, ii, j, midj)
                 searchMatrixHelper(matrix, target, i, midi, midj + 1, jj)
                 searchMatrixHelper(matrix, target, midi + 1, ii, midj + 1, jj);
    }
}