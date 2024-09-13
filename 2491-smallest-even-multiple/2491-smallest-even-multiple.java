class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;

        n = n + n;
        while (n % 2 != 0) {
            n = n + n; 
        }
        return n;
    }
}