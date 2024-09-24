class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        getPermutations(nums, visited, new ArrayList<>(), ans);
        return ans;
    }

    public void getPermutations(int[] arr, boolean[] visited, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == arr.length) {
            ans.add(new ArrayList(list));
            return;
        }

        for (int i = 0; i < visited.length; i++) {
            if(visited[i]) continue;
            list.add(arr[i]);
            visited[i] = true;
            getPermutations(arr, visited, list, ans);
            list.removeLast();
            visited[i] = false;
        }
    }
}