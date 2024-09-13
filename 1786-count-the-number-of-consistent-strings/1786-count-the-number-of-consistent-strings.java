class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentStrings = 0;

        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    isConsistent = false; 
                    break;
                }
            }

            if (isConsistent) consistentStrings++;
        }

        return consistentStrings;
    }
}