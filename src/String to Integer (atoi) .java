public class Solution {
    public int myAtoi(String str) {
        

		int max = Integer.MAX_VALUE;
		int min = -Integer.MIN_VALUE;
		long result = 0;
		str = str.trim();
		int len = str.length();
		if (len < 1)
			return 0;
		int start = 0;
		boolean neg = false;

		if (str.charAt(start) == '-' || str.charAt(start) == '+') {
			if (str.charAt(start) == '-')
				neg = true;
			start++;
		}

		for (int i = start; i < len; i++) {
			char ch = str.charAt(i);

			if (ch < '0' || ch > '9')
				break;
			result = 10 * result + (ch - '0');
			if (!neg && result > max)
				return max;
			if (neg && -result < min)
				return min;

		}
		if (neg)
			result = -result;

		return (int) result;
	
    }
}