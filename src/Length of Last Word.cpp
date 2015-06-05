class Solution {
public:
bool ischar(char p)
	{
		return ('a'<=p && p<='z')||('A'<=p && p<='Z');
	}
int lengthOfLastWord(const char *s) {
        // Note: The Solution object is instantiated only once.
		int len = strlen(s);
		if(len<1)return 0;

		int end = len-1;
		while((end>=0)&&s[end]==' ')end--;

		int begin = end;
		while((begin>=0)&& ischar(s[begin]))begin--;

		return end-begin;		
    }
};
