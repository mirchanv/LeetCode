class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getSubsets(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void getSubsets(int[] nums, int index, List<Integer> list, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList(list));
            return;
        }

        // pick the number
        list.add(nums[index]);
        getSubsets(nums, index + 1, list, ans);

        // dont pick the number
        list.remove(list.size()-1);
        getSubsets(nums, index + 1, list, ans);
    }
}