import java.util.Arrays;

public class EmptyArray {
    public static int minOperations(int[] nums) {
        int operations = 0;
        int minIndex = 0;
        while (nums.length > 0) {
            minIndex = findMinIndex(nums);
            operations += Math.min(minIndex, nums.length - minIndex);
            nums = rotateArray(nums, minIndex);
        }
        return operations;
    }

    private static int findMinIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int[] rotateArray(int[] nums, int k) {
        int[] rotated = new int[nums.length];
        for (int i = 0; i < nums.length - k; i++) {
            rotated[i] = nums[i + k];
        }
        for (int i = 0; i < k; i++) {
            rotated[nums.length - k + i] = nums[i];
        }
        return Arrays.copyOfRange(rotated, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1};
        System.out.println(minOperations(nums));
    }
}
