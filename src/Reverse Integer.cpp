class Solution {
public:
    int reverse(int x) {
    	int isnegative = x<0?-1:1;
    	long n = isnegative * x;
    	long result = 0;
    	int tmp = 1;
    	long k = n;
    	while(n/tmp>0){
    		result = result*10+k%10;
    		k=k/10;
    		tmp= tmp*10;
    	}
    	return (int)result*isnegative;
        
    }
};