class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        helper(0, target, 0, nums, new ArrayList<>());
        return res;
    }

    private void helper(int i, int target, int total, int[] nums, List<Integer> temp){
        if(target == total){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int j = i; j < nums.length; j++){
            if(total + nums[j] > target){
                continue;
            }

            temp.add(nums[j]);
            helper(j, target, total + nums[j], nums, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
