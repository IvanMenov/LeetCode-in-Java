package g0201_0300.s0290_word_pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void wordPattern() {
        assertThat(new Solution().wordPattern("abba", "dog cat cat dog"), equalTo(true));
    }

    @Test
    public void wordPattern2() {
        assertThat(new Solution().wordPattern("abba", "dog cat cat fish"), equalTo(false));
    }

    @Test
    public void wordPattern3() {
        assertThat(new Solution().wordPattern("aaaa", "dog cat cat dog"), equalTo(false));
    }

    @Test
    public void wordPattern4() {
        assertThat(new Solution().wordPattern("abba", "dog dog dog dog"), equalTo(false));
    }
}
