public class Solution {
	public int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		if (n <= 0) {
			return matrix;
		} else if (n == 1) {
			matrix[0][0] = 1;
			return matrix;
		} else if (n > 1) {
			int top = 0;
			int bottom = matrix.length - 1;
			int left = 0;
			int right = matrix[0].length - 1;
			int value = 1;
			while (true) {
				for (int i = left; i <= right; i++) {
					matrix[top][i] = value;
					value++;
				}
				top++;
				if (boundriesCrossed(left, right, bottom, top)) {
					break;
				}
				for (int i = top; i <= bottom; i++) {
					matrix[i][right] = value;
					value++;
				}
				right--;
				if (boundriesCrossed(left, right, bottom, top)) {
					break;
				}
				for (int i = right; i >= left; i--) {
					matrix[bottom][i] = value;
					value++;
				}
				bottom--;
				if (boundriesCrossed(left, right, bottom, top)) {
					break;
				}
				for (int i = bottom; i >= top; i--) {
					matrix[i][left] = value;
					value++;
				}
				left++;
				if (boundriesCrossed(left, right, bottom, top)) {
					break;
				}
			}
		}
		return matrix;

	}

	private boolean boundriesCrossed(int left, int right, int bottom, int top) {
		if (left > right || bottom < top)
			return true;
		else
			return false;
	}
}