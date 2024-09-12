class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int num : nums) {
            int matches = map.getOrDefault(num, 0);
            pairs += matches;
            map.put(num, matches + 1);
        }

        return pairs;
    }
}