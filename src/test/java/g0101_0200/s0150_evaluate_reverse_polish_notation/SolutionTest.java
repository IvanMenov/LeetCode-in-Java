package g0101_0200.s0150_evaluate_reverse_polish_notation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void evalRPN() {
        assertThat(new Solution().evalRPN(new String[] {"2", "1", "+", "3", "*"}), equalTo(9));
        assertThat(new Solution().evalRPN(new String[] {"4", "13", "5", "/", "+"}), equalTo(6));
        assertThat(
                new Solution()
                        .evalRPN(
                                new String[] {
                                    "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5",
                                    "+"
                                }),
                equalTo(22));
    }
}
