class Solution {
public:
    int hammingWeight(uint32_t n) {
        int a = 0;
        int m;
        while(n>0){
            m=n%2;
            if(m==1){
                a++;
            }
            n=n/2;
            
            
        }
        return a;
        
    }
};