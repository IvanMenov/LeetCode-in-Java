package g0101_0200.s0188_best_time_to_buy_and_sell_stock_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxProfit() {
        assertThat(new Solution().maxProfit(2, new int[] {2, 4, 1}), equalTo(2));
        assertThat(new Solution().maxProfit(2, new int[] {3, 2, 6, 5, 0, 3}), equalTo(7));
    }
}
