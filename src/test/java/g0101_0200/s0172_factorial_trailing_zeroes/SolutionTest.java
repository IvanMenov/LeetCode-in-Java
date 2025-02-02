package g0101_0200.s0172_factorial_trailing_zeroes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void trailingZeroes() {
        assertThat(new Solution().trailingZeroes(3), equalTo(0));
    }

    @Test
    public void trailingZeroes2() {
        assertThat(new Solution().trailingZeroes(5), equalTo(1));
    }

    @Test
    public void trailingZeroes3() {
        assertThat(new Solution().trailingZeroes(0), equalTo(0));
    }
}
