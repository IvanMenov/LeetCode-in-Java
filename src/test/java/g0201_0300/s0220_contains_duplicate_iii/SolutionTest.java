package g0201_0300.s0220_contains_duplicate_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void containsDuplicateIII() {
        assertThat(
                new Solution().containsNearbyAlmostDuplicate(new int[] {1, 2, 3, 1}, 3, 0),
                equalTo(true));
    }
}
