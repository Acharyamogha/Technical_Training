public class Solution {
    public int MissingNumber(int[] arr, int n) {
        int total = (n + 1) * (n + 2) / 2;
        for (int num : arr) {
            total -= num;
        }
        return total;
    }
}
