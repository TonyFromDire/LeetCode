public class Solution {
	public List<List<Integer>> generate(int numRows) {
		// ��k����k��Ԫ��
		// ÿ���һ���Լ����һ��Ԫ��ֵΪ1
		// ���ڵ�k�� k > 2�� ���n�� n > 1 && n < k�� ��Ԫ��A[k][n]�� A[k][n] = A[k-1][n-1] +
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