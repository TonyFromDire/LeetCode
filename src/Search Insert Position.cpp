class Solution {
public:
    int searchInsert(int A[], int n, int target) {
        if(NULL == A || 0 == n)
    		return 0;
		int left = 0, right = n-1, mid = 0;
		while(left <= right)
		{
			mid = left + (right-left)/2;
			if(target == A[mid])
				return mid;
			else if(target < A[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}	
		return left;
    }
};
