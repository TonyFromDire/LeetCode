public class Solution {
    public int romanToInt(String s) {
        int ret = toNumber(s.substring(0, 1));  
     for (int i = 1; i < s.length(); i++) {  
         if (toNumber(s.substring(i-1, i)) < toNumber(s.substring(i, i+1))) {  
             ret += toNumber(s.substring(i, i+1)) - 2*toNumber(s.substring(i-1, i));  
         } else {  
             ret += toNumber(s.substring(i, i+1));  
         }  
     }  
     return ret;  
 }  
    public int toNumber(String s) {
              switch (s) {  
            case "I": return 1;  
            case "V": return 5;  
            case "X": return 10;  
            case "L": return 50;  
            case "C": return 100;  
            case "D": return 500;  
            case "M": return 1000;  
        }  
        return 0;  
    }
}