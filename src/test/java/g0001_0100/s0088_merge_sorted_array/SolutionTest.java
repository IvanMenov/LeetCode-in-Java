package g0001_0100.s0088_merge_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void merge() {
        int[] array = new int[] {1, 2, 3, 0, 0, 0};
        new Solution().merge(array, 3, new int[] {2, 5, 6}, 3);
        assertThat(array, equalTo(new int[] {1, 2, 2, 3, 5, 6}));
    }
}
