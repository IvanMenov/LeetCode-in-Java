package s0066_plus_one;

public class Solution {
    public int[] plusOne(int[] digits) {
        int num = 1;
        int carry = 0;
        int sum = 0;
        // int sum = num + digits[0];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) sum = digits[i] + carry + num;
            else sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }
        if (carry != 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = carry;
            for (int i = 1; i < ans.length; i++) ans[i] = digits[i - 1];
            return ans;
        }
        return digits;
    }
}