package g0001_0100.s0090_subsets_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S5413")
public class Solution {
    List<List<Integer>> allComb = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        dfs(0);
        allComb.add(new ArrayList<>());
        return allComb;
    }

    private void dfs(int start) {
        if (start > nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            comb.add(nums[i]);
            allComb.add(new ArrayList<>(comb));
            dfs(i + 1);
            comb.remove(comb.size() - 1);
        }
    }
}
