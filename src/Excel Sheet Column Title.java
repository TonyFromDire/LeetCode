public class Solution {
    public String convertToTitle(int n) {
		if (n < 1) {
			return "";
		} else {
			String temp = "";
			StringBuffer buffer = new StringBuffer();
			while (n > 0) {
				n--;
				char c = (char) (n % 26 + 'A');
				temp += c;
				n /= 26;
			}
			for (int i = temp.length() - 1; i >= 0; i--) {
				buffer.append(temp.charAt(i));
			}
			return buffer.toString();
		}
    }
}