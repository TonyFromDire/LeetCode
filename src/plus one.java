public class Solution {
    public int[] plusOne(int[] digits) {
        		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				
				digits[i]++;
				
				return digits;
			} else {
				if (i > 0) {
					digits[i] = 0;
				} else if (i == 0) {
					digits[i] = 0;
					int[] big = new int[digits.length + 1];
					int j;
					for (j = big.length - 1; j > 0; j--) {
						big[j] = 0;
					}
					big[j] = 1;
					return big;
				}

			}
		}
		return digits;
    }
}