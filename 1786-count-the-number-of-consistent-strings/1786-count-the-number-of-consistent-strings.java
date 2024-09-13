class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentStrings = 0;

        // for (String word : words) {
        //     for (int i = 0; i < word.length(); i++) {
        //         if (allowed.indexOf(word.charAt(i)) == -1) break;
        //         if (i == word.length()-1) consistentStrings++;
        //     }
        // }

        for (String str : words) {
            for (char ch : allowed.toCharArray()) {
                str = str.replace(String.valueOf(ch), "");
            }
            if (str.length() == 0) consistentStrings++;
        }

        return consistentStrings;
    }
}