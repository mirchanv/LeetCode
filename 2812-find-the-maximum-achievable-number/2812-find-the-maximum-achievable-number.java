class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int maxAchievableNumber = Integer.MIN_VALUE;
        for (int i = 0; i < t; i++) {
            maxAchievableNumber = num + 2;
            num += 2;
        }
        return maxAchievableNumber;
    }
}