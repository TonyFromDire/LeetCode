class Solution {
public:
    int maxProfit(vector<int> &prices) {
                int profit = 0, n = prices.size();
        if (n == 0) {
            return 0;
        }
        int l[n], r[n];
        memset(l, 0, sizeof(int) * n);
        memset(r, 0, sizeof(int) * n);
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            l[i] = prices[i] - min > l[i - 1] ? prices[i] - min : l[i - 1];        
            min = prices[i] < min ? prices[i] : min;
        }
        int max = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            r[i] = max - prices[i] > r[i + 1] ? max - prices[i] : r[i + 1];
            max = prices[i] > max ? prices[i] : max;
        }
        for (int i = 0; i < n; i++) {
            profit = l[i] + r[i] > profit ? l[i] + r[i] : profit;
        }
        return profit;      
        
    }
};
