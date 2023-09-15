
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        if (nums == null || nums.isEmpty()) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= maxSum) {
                secondMax = maxSum;
                maxSum = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return maxSum + secondMax;
    }
}