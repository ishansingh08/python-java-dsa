class Solution {
    public int linearSearch(int[] nums, int target) {
        // Check elements from left to right to find the first match.
        for (int index = 0; index < nums.length; index++) {
            // Return as soon as the target is found.
            if (nums[index] == target) {
                return index;
            }
        }

        // Reaching here means the target is not present.
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 2};
        int target = 2;

        Solution solution = new Solution();
        int answer = solution.linearSearch(nums, target);

        System.out.println("Index: " + answer);
    }
}
