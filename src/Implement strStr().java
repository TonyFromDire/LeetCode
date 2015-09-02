public class Solution {
	public int strStr(String haystack, String needle) {
		Stack<Character> stack = new Stack<Character>();
		int index = 0;	
        if (haystack == null){  
            return -1;  
        }  
        if (needle == null || needle.equals("")){  
            return 0;  
        }  
        if (needle.length() > haystack.length()){  
            return -1;  
        }  
		for (int i = 0; i < haystack.length(); i++) {

			if (needle.charAt(0) == haystack.charAt(i)) {
				stack.push(needle.charAt(0));
				if (stack.size() == needle.length()) {
					return index;
				}

				index = i;

				for (int j = 1; j < needle.length()
						; j++) {
                                        if (index + j > haystack.length() - 1){  
                        return -1;  
                    }     
					if (needle.charAt(j) == haystack.charAt(j + index)) {

						stack.push(needle.charAt(j));
						if (stack.size() == needle.length()) {
							return index;
						}

					} else {
						stack.clear();

						break;
					}
				}

			} else {
				stack.clear();

			}

		}

		return -1;

	}
}