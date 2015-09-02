public class Solution {
    public int countPrimes(int n) {
        		boolean[] a = new boolean[n + 1];
        		int number=0;
		for (int i = 2; i <=n; i++)
			a[i] = true;//先都认为是质数
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (a[i])
				for (int j = i; j * i <= n; j++)
					a[j * i] = false;
		}
		for (int i = 0; i < n; i++) {
			if (a[i])
				number++;
		}
		return number;
    }
}