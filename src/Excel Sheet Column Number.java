public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i <s.length(); i++) {
        	//System.out.println("i is:" + i);
        	//System.out.println("char is:" + s.charAt(i));
        	int temp =  s.charAt(i)-'A'+1;
        	//System.out.println("temp is:" + temp);
        	result = result*26+temp;
        	//System.out.println("result is:" + result);
		}
    	
    	return result;
    }
}