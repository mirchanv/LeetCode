class Solution {
    public int findPermutationDifference(String s, String t) {
        int difference = 0;

        for (int i = 0; i < s.length(); i++) {
            difference += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return difference;
    }
}