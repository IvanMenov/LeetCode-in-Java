package s0080_remove_duplicates_from_sorted_array_ii;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        int count = 0;
        while (i < nums.length - 1) {
            ++count;
            if (count <= 2) {
                nums[k++] = nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                count = 0;
                i++;
                continue;
            }
            i++;
        }

        ++count;
        if (count <= 2) {
            nums[k++] = nums[i];
        }
        return k;
    }
}