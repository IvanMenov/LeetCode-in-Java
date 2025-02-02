package g0201_0300.s0283_move_zeroes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void moveZeroes() {
        int[] array = {0, 1, 0, 3, 12};
        new Solution().moveZeroes(array);
        assertThat(array, equalTo(new int[] {1, 3, 12, 0, 0}));
    }
}
