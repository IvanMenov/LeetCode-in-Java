package g0101_0200.s0198_house_robber;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void rob() {
        assertThat(new Solution().rob(new int[] {1, 2, 3, 1}), equalTo(4));
    }

    @Test
    public void rob2() {
        assertThat(new Solution().rob(new int[] {2, 7, 9, 3, 1}), equalTo(12));
    }
}
