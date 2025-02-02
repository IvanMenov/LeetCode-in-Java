package g0001_0100.s0053_maximum_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxSubArray() {
        assertThat(
                new Solution().maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}), equalTo(6));
    }
}
