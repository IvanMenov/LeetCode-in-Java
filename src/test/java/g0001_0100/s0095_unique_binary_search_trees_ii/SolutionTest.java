package g0001_0100.s0095_unique_binary_search_trees_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void generateTrees() {
        assertThat(
                new Solution().generateTrees(3).toString(),
                equalTo(
                        "[3,2,1,null,null, 2,1,3, 3,1,null,2,null, 1,null,3,2,null, 1,null,2,null,3]"));
    }
}
