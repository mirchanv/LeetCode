class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for (int[] curr : accounts) {
            int customerWealth = 0;
            for (int val : curr) {
                customerWealth += val;
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }

        return maxWealth;
    }
}
