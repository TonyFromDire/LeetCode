public class Solution {

        public  boolean isPalindrome(int x) {
        int illution = x;
        int bit = 0;
        int set = 0;
        boolean is = false;
        if(x<0){
        	return is;
        	}
        if (x==0) {
        	is = true ;
			return is;
		}else{
			while(illution>0){
				illution = illution/10;
				bit++;
			}
			for (int i = 1; i <= bit/2; i++) {
				if (nth(x, i)==nth(x, bit+1-i)) {
					set++;
				}			
			}
			if (set==bit/2) {
	        	is = true ;
				return is;
			}else {
				return is;
			}			
		}      
    }
    public int nth(int num,int n) {
    	int temp = 0;
    	for(int i=0;i<n;i++){
        	 temp = num%10;
        	num = num/10;
        }
    	return temp;
    }
}