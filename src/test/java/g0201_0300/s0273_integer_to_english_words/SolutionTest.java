package g0201_0300.s0273_integer_to_english_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void numberToWords() {
        assertThat(new Solution().numberToWords(123), equalTo("One Hundred Twenty Three"));
    }

    @Test
    public void numberToWords2() {
        assertThat(
                new Solution().numberToWords(12345),
                equalTo("Twelve Thousand Three Hundred Forty Five"));
    }

    @Test
    public void numberToWords3() {
        assertThat(
                new Solution().numberToWords(1234567),
                equalTo("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"));
    }
}
