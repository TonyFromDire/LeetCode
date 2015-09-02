public class Solution {
	public List<List<Integer>> generate(int numRows) {
		// 第k层有k个元素
		// 每层第一个以及最后一个元素值为1
		// 对于第k（ k > 2） 层第n（ n > 1 && n < k） 个元素A[k][n]， A[k][n] = A[k-1][n-1] +
		// A[k-1][n]
		List<List<Integer>> answerList = new ArrayList<List<Integer>>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> listn = new ArrayList<Integer>();
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					listn.add(1);
				} else {
					listn.add(answerList.get(i - 2).get(j - 2)
							+ answerList.get(i - 2).get(j - 1));
				}
			}

			answerList.add(listn);
		}

		
		return answerList;
	}
}