class Solution {
    public int secondLargest(int[] nums) {
        int n = nums.length;

        /*
         * At least two values are needed
         * to have a distinct second largest.
         */
        if (n < 2) {
            return -1;
        }

        int largest = nums[0];

        // First pass finds the largest value.
        for (int index = 1; index < n; index++) {
            if (nums[index] > largest) {
                largest = nums[index];
            }
        }

        int secondLargest = 0;
        boolean hasSecond = false;

        /*
         * Only values smaller than largest
         * can be valid second-largest values.
         */
        for (int num : nums) {
            if (num < largest) {

                /*
                 * Keep the greatest valid value
                 * found below the maximum.
                 */
                if (!hasSecond || num > secondLargest) {
                    secondLargest = num;
                    hasSecond = true;
                }
            }
        }

        // No valid candidate was found.
        if (!hasSecond) {
            return -1;
        }

        return secondLargest;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {8, 8, 5, 3, 5};

        Solution solution = new Solution();
        System.out.println(solution.secondLargest(nums));
    }
}
