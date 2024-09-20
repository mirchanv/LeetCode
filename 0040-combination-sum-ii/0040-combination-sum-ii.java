class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        getCombos(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    public void getCombos(int[] arr, int index, int target, List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i-1]) continue;
            if (arr[i] > target) break;
            
            list.add(arr[i]);
            getCombos(arr, i + 1, target-arr[i], list, ans);
            list.removeLast();
        }
    }
}