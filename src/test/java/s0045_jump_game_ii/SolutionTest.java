package s0045_jump_game_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void jump() {
        assertThat(new Solution().jump(new int[] {2, 3, 1, 1, 4}), equalTo(2));
    }
}