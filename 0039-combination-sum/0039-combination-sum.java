class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getCombos(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    public void getCombos(int[] arr, int index, int target, List<Integer> list, List<List<Integer>> ans) {
        if (index >= arr.length) {
            if (target == 0) {
                ans.add(new ArrayList(list));
            }
            return;
        }

        // pick
        if (arr[index] <= target) {
            list.add(arr[index]);
            getCombos(arr, index, target-arr[index], list, ans);
            list.removeLast();
        }

        // not pick
        getCombos(arr, index + 1, target, list, ans);
    }
}