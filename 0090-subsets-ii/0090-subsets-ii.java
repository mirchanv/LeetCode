class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);

        getSubsets(nums, 0, visited, new ArrayList<>(), ans);
        return ans;
    }

    public void getSubsets(int[] arr, int index, boolean[] visited, List<Integer> ans, List<List<Integer>> list) {
        list.add(new ArrayList(ans));

        if (index >= arr.length) return;

        for (int i = index; i < visited.length; i++) {
            if(visited[i]) continue;
            if(i > index && arr[i] == arr[i-1]) continue;
            ans.add(arr[i]);
            visited[i] = true;
            getSubsets(arr, i + 1, visited, ans, list);
            ans.removeLast();
            visited[i] = false;
        }
    }
}