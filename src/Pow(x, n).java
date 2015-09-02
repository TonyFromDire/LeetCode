public class Solution {
	public double myPow(double x, int n) {
		if (n == 0)
			return 1.0;
		if (n < 0){
			x = 1 / x;  
            n = -1 * n;
		    //快于1/myPow（x，-n），不知道咋回事
		} 
		if (n % 2 == 1) {
			return x * myPow(x * x, n / 2);
		} else {
			return myPow(x*x, n/2);
		}

	}
}
