class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;

        int temp = n + n;
        while (temp % 2 != 0) {
            temp++; 
        }
        return temp;
    }
}