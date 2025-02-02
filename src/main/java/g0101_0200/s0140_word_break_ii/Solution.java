package g0101_0200.s0140_word_break_ii;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new LinkedList<>();
        Set<String> wordSet = new HashSet<>(wordDict);
        dfs(s, wordSet, 0, new StringBuilder(), result);
        return result;
    }

    private void dfs(
            String s, Set<String> wordSet, int index, StringBuilder sb, List<String> result) {
        if (index == s.length()) {
            if (sb.charAt(sb.length() - 1) == ' ') {
                sb.setLength(sb.length() - 1);
            }
            result.add(sb.toString());
            return;
        }
        int len = sb.length();
        for (int i = index + 1; i <= s.length(); ++i) {
            String subs = s.substring(index, i);
            if (wordSet.contains(subs)) {
                sb.append(subs).append(" ");
                dfs(s, wordSet, i, sb, result);
            }
            sb.setLength(len);
        }
    }
}
