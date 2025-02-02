package g0001_0100.s0040_combination_sum_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combinationSum2() {
        int[][] expected = {{1, 1, 6}, {1, 2, 5}, {1, 7}, {2, 6}};
        assertThat(
                new Solution().combinationSum2(new int[] {10, 1, 2, 7, 6, 1, 5}, 8),
                equalTo(ArrayUtils.getLists(expected)));
    }
}
