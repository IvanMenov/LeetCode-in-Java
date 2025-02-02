package g0001_0100.s0081_search_in_rotated_sorted_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void search() {
        Solution solution = new Solution();
        assertThat(solution.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 0), equalTo(true));
        assertThat(solution.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 3), equalTo(false));
    }
}
