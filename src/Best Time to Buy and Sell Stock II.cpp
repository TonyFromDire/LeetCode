class Solution {
public:
    int maxProfit(vector<int> &prices) {
    	int profit =0,mairu = 0;
    	if(prices.size()==0){
    		return profit;
    	}
      mairu =prices[0];
        for(int i=1;i<prices.size();i++){
        	if(prices[i]>=mairu){
        		profit=profit+prices[i]-mairu;
        		mairu=prices[i];
        	}
        	else{
        		mairu=prices[i];
        	}
        }
        return profit;
    }
};
