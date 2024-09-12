class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < jewels.length(); i++) {
            map.put(jewels.charAt(i), 0);
        }

        for (int i = 0; i < stones.length(); i++) {
            if (map.containsKey(stones.charAt(i))) {
                ans += 1;
            }
        }

        return ans;
    }
}