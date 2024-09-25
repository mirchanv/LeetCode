class Solution {
    public List<String> letterCombinations(String digits) {
        String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = new ArrayList<>();
        if (digits.length() > 0)
            getCombos(digits, 0, keys, new StringBuilder(), list);
        return list;
    }

    public void getCombos(String digits, int index, String[] keys, StringBuilder ans, List<String> list) {
        if (index >= digits.length()) {
            list.add(new String(ans.toString()));
            return;
        }

        String letters = keys[Character.getNumericValue(digits.charAt(index))];

        for (int i = 0; i < letters.length(); i++) {
            ans.append(letters.charAt(i));
            getCombos(digits, index + 1, keys, ans, list);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}