package g0001_0100.s0040_combination_sum_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> sums = new ArrayList<>();
        Arrays.sort(candidates); // optimize
        combinationSum(candidates, target, 0, sums, new LinkedList<>());
        return sums;
    }

    private void combinationSum(
            int[] candidates,
            int target,
            int start,
            List<List<Integer>> sums,
            LinkedList<Integer> sum) {
        if (target == 0) {
            // make a deep copy of the current combination
            sums.add(new ArrayList<>(sum));
            return;
        }
        for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
            // If candidate[i] equals candidate[i-1], then solutions for i is subset of
            // solution of i-1
            // Refer:
            // https://leetcode.com/problems/combination-sum-ii/discuss/16861/Java-solution-using-dfs-easy-understand/977097
            if (i == start || (i > start && candidates[i] != candidates[i - 1])) {
                sum.addLast(candidates[i]);
                // call on 'i+1' (not i) to avoid duplicate usage of same element
                combinationSum(candidates, target - candidates[i], i + 1, sums, sum);
                sum.removeLast();
            }
        }
    }
}
