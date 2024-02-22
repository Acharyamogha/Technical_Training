public class SameAverage {
    public static boolean splitArraySameAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        for (int lenA = 1; lenA <= n / 2; lenA++) {
            if (sum * lenA % n == 0 && subsetSum(nums, sum * lenA / n, lenA, 0)) {
                return true;
            }
        }
        return false;
    }

    private static boolean subsetSum(int[] nums, int target, int k, int index) {
        if (k == 0) {
            return target == 0;
        }
        if (index == nums.length) {
            return false;
        }
        return subsetSum(nums, target - nums[index], k - 1, index + 1) ||
               subsetSum(nums, target, k, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(splitArraySameAverage(nums));
    }
}
