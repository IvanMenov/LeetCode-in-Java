package g0101_0200.s0119_pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] buffer = new int[rowIndex + 1];
        buffer[0] = 1;
        computeRow(buffer, 1);

        // Copy buffer to List of Integer.
        List<Integer> ans = new ArrayList<>(buffer.length);
        for (int i = 0; i < buffer.length; i++) {
            ans.add(buffer[i]);
        }
        return ans;
    }

    private void computeRow(int[] buffer, int k) {
        if (k >= buffer.length) {
            return;
        }
        int previous = buffer[0];
        for (int i = 1; i < k; i++) {
            int tmp = previous + buffer[i];
            previous = buffer[i];
            buffer[i] = tmp;
        }
        buffer[k] = 1;
        computeRow(buffer, k + 1);
    }
}
