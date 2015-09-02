public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
            int sums;
            sums = (C - A) * (D - B) + (G - E) * (H - F);
            return sums - Math.max(Math.min(C, G) - Math.max(A, E), 0) * Math.max(Math.min(D, H) - Math.max(B, F), 0);
    }
}