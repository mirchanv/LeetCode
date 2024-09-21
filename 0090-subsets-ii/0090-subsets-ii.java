class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        getSubsets(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void getSubsets(int[] arr, int index, List<Integer> ans, List<List<Integer>> list) {
        list.add(new ArrayList(ans));

        if (index >= arr.length) return;

        for (int i = index; i < arr.length; i++) {
            if(i > index && arr[i] == arr[i-1]) continue;
            ans.add(arr[i]);
            getSubsets(arr, i + 1, ans, list);
            ans.removeLast();
        }
    }
}