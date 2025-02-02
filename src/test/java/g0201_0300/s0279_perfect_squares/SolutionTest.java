package g0201_0300.s0279_perfect_squares;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void numSquares() {
        assertThat(new Solution().numSquares(12), equalTo(3));
    }

    @Test
    public void numSquares2() {
        assertThat(new Solution().numSquares(13), equalTo(2));
    }
}
