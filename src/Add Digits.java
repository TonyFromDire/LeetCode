public class Solution {
    public int addDigits(int num) {
      if (num==0)
            return 0;
        if (num==9)
            return 9;
        if(num%9==0)
            return 9;
    int digits=num%9;

    return  digits;
    }
}