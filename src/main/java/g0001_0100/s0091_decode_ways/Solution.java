package g0001_0100.s0091_decode_ways;

public class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1; // Auxiliary
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            // Calculate the independent number
            if (s.charAt(i - 1) != '0') {
                // As long as the current character is not 0, it means that the previous decoding
                // number can be inherited
                f[i] = f[i - 1];
            }
            // Calculate the number of combinations
            int twodigits = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
            if (twodigits >= 10 && twodigits <= 26) {
                f[i] += f[i - 2];
            }
        }
        return f[n];
    }
}
