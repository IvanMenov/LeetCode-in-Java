package g0101_0200.s0164_maximum_gap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maximumGap() {

        assertThat(new Solution().maximumGap(new int[] {3, 6, 9, 1}), equalTo(3));
    }
}
