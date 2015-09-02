public class Solution {
	public int nthUglyNumber(int n) {
		// 1, 2, 3, 4, 5, 6, 8, 9, 10, 12
		int[] ugly = new int[n + 1];
		ugly[1] = 1;
		int index1 = 1, index2 = 1, index3 = 1;
		int factor1 = 2 * ugly[index1], factor2 = 3 * ugly[index2], factor3 = 5 * ugly[index3];
		for (int i = 2; i <= n; i++) {
			int min = Math.min(Math.min(factor1, factor2), factor3);
			ugly[i] = min;
			if (factor1 == min) {
				index1++;
				factor1 = 2 * ugly[index1];
			}
			if (factor2 == min) {
				index2++;
				factor2 = 3 * ugly[index2];
			}
			if (factor3 == min) {
				index3++;
				factor3 = 5 * ugly[index3];
			}
		}

		return ugly[n];
	}
}